package com.retail.store.discount.service;

import com.retail.store.discount.repository.UserRepository;
import com.retail.store.discount.repository.model.User;
import com.retail.store.discount.repository.model.UserTypeEntity;
import com.retail.store.discount.service.exception.ServiceException;
import com.retail.store.discount.service.model.BillInfo;
import com.retail.store.discount.service.model.Item;
import com.retail.store.discount.service.model.UserType;
import com.retail.store.discount.service.netamountcalculator.NetAmountCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BillCalculatorService {

  private UserRepository userRepository;
  private NetAmountCalculator netAmountCalculator;

  @Autowired
  public BillCalculatorService(UserRepository userRepository, NetAmountCalculator netAmountCalculator) {
    this.userRepository = userRepository;
    this.netAmountCalculator = netAmountCalculator;
  }

  public boolean nonUserExist(Long userId) {
    return !userExist(userId);
  }

  public boolean userExist(Long userId) {
    if (Objects.isNull(userId)) {
      throw new IllegalArgumentException("User id cannot be null");
    }

    return Objects.nonNull(userRepository.findById(userId));
  }

  public BillInfo calculateNetPayable(Long userId, Collection<Item> items) throws ServiceException {
    return BillInfo.builder()
        .totalAmount(calculateTotalAmount(items))
        .netAmount(calculateTotalNet(userId, items)).build();
  }

  BigDecimal calculateTotalAmount(Collection<Item> items) {
    if (items == null) {
      return BigDecimal.ZERO;
    }

    return items.stream().map(Item::getAmount).collect(Collectors.reducing(BigDecimal.ZERO, BigDecimal::add));
  }

  BigDecimal calculateTotalNet(Long userId, Collection<Item> items) throws ServiceException {
    if (items == null) {
      return BigDecimal.ZERO;
    }

    User user = getUser(userId);
    return netAmountCalculator.calculate(getUserType(user), user.getCreatedDate(), items);
  }

  public User getUser(Long userId) throws ServiceException {
    final Optional<User> user = userRepository.findById(userId);
    if (!user.isPresent()) {
      throw new ServiceException("Cannot find user id [" + userId + "]");
    }

    return user.get();
  }

  public UserType getUserType(User user) throws ServiceException {
    final UserTypeEntity userTypeEntity = user.getUserType();
    if (userTypeEntity == null) {
      throw new ServiceException("Cannot find user type for user id [" + user.getId() + "]");
    }

    return UserType.getUserType(userTypeEntity.getId());
  }
}
