package com.retail.store.discount.service;

import com.retail.store.discount.repository.UserRepository;
import com.retail.store.discount.repository.model.User;
import com.retail.store.discount.repository.model.UserTypeEntity;
import com.retail.store.discount.service.exception.ServiceException;
import com.retail.store.discount.service.model.Item;
import com.retail.store.discount.service.model.ItemType;
import com.retail.store.discount.service.netamountcalculator.NetAmountCalculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Optional;

public class BillCalculatorServiceTest {

  private static final UserTypeEntity CUSTOMER_USER_TYPE = new UserTypeEntity(Integer.valueOf(1), "Customer", "Customer type");

  @Mock
  private UserRepository userRepository = Mockito.mock(UserRepository.class);

  private BillCalculatorService billCalculatorService = new BillCalculatorService(userRepository, new NetAmountCalculator());

  @Before
  public void beforeMethod() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void testUserExistWhenUserIdIsNull() {
    Mockito.when(userRepository.findById(ArgumentMatchers.anyLong())).thenReturn(null);

    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      billCalculatorService.userExist(null);
    });
  }

  @Test
  public void testNonUserExistWhenUserIdIsNull() {
    Mockito.when(userRepository.findById(ArgumentMatchers.anyLong())).thenReturn(null);

    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      billCalculatorService.nonUserExist(null);
    });
  }

  @Test
  public void testNonUserExistWhenUserDoesNotExist() {
    Mockito.when(userRepository.findById(ArgumentMatchers.anyLong())).thenReturn(null);
    Assert.assertEquals(billCalculatorService.nonUserExist(Long.valueOf(1)), true);
  }

  @Test
  public void testNonUserExistWhenUserExists() {
    Mockito.when(userRepository.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.ofNullable(aCustomerUser()));
    Assert.assertEquals(billCalculatorService.nonUserExist(Long.valueOf(1)), false);
  }

  @Test
  public void tesUserExistWhenUserExists() {
    Mockito.when(userRepository.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.ofNullable(aCustomerUser()));
    Assert.assertEquals(billCalculatorService.userExist(Long.valueOf(1)), true);
  }

  @Test
  public void testUserExistWhenUserDoesNotExist() {
    Mockito.when(userRepository.findById(ArgumentMatchers.anyLong())).thenReturn(null);
    Assert.assertEquals(billCalculatorService.userExist(Long.valueOf(1)), false);
  }

  @Test
  public void testCalculateTotalAmount() {
    Assert.assertEquals(billCalculatorService.calculateTotalAmount(getListOfItems()), new BigDecimal(800));
  }

  @Test
  public void testCalculateTotalAmountWhenItemsIsNull() {
    Assert.assertEquals(billCalculatorService.calculateTotalAmount(null), BigDecimal.ZERO);
  }

  @Test
  public void testCalculateTotalAmountWhenItemsIsEmpty() {
    Assert.assertEquals(billCalculatorService.calculateTotalAmount(Collections.emptyList()), BigDecimal.ZERO);
  }


  @Test
  public void testCalculateNetAmountWhenItemsIsNull() {
    Assert.assertEquals(billCalculatorService.calculateTotalNet(null, null), BigDecimal.ZERO);
  }

  @Test
  public void testCalculateNetAmountWhenUserIdIsNull() {
    Assertions.assertThrows(ServiceException.class, () -> {
      billCalculatorService.calculateTotalNet(null, Collections.emptyList());
    });
  }

  @Test
  public void testCalculateNetAmountWhenUserDoesNotExist() {
    Mockito.when(userRepository.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.empty());

    Assertions.assertThrows(ServiceException.class, () -> {
      billCalculatorService.calculateTotalNet(ArgumentMatchers.anyLong(), Collections.emptyList());
    });
  }

  @Test
  public void testCalculateNetAmountWhenUserTypeIsNull() {
    Mockito.when(userRepository.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.ofNullable(aCustomerUserWithoutUserType()));

    Assertions.assertThrows(ServiceException.class, () -> {
      billCalculatorService.calculateTotalNet(ArgumentMatchers.anyLong(), Collections.emptyList());
    });
  }

  public User aCustomerUserWithoutUserType() {
    final User user = new User();
    user.setId(Long.valueOf(1));
    user.setFirstName("TestFirst");
    user.setLastName("TestLast");
    user.setCreatedDate(new Date());

    return user;
  }


  public User aCustomerUser() {
    final User user = new User();
    user.setId(Long.valueOf(1));
    user.setFirstName("TestFirst");
    user.setLastName("TestLast");
    user.setCreatedDate(new Date());
    user.setUserType(CUSTOMER_USER_TYPE);

    return user;
  }

  private Collection<Item> getListOfItems() {
    final Collection<Item> items = new ArrayList<>();
    items.add(new Item(new BigDecimal(200), ItemType.GROCERY));
    items.add(new Item(new BigDecimal(200), ItemType.GROCERY));
    items.add(new Item(new BigDecimal(200), ItemType.OTHERS));
    items.add(new Item(new BigDecimal(200), ItemType.OTHERS));
    return items;
  }
}
