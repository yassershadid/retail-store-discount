package com.retail.store.discount.repository;

import com.retail.store.discount.repository.model.User;
import com.retail.store.discount.repository.model.UserTypeEntity;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class UserDataInitializer {

  @Bean
  public CommandLineRunner initalizeData(UserRepository userRepository, UserTypeRepository userTypeRepository) {
    return (args) -> {
      final UserTypeEntity userCustomerType = getCustomerType();
      final UserTypeEntity userAffiliateType = getAffiliateType();
      final UserTypeEntity userEmployeeType = getEmployeeType();

      userTypeRepository.save(userCustomerType);
      userTypeRepository.save(userAffiliateType);
      userTypeRepository.save(userEmployeeType);

      userRepository.save(new User(Long.valueOf(1), "Yasser", "Shadid", new Date(), userCustomerType));
      userRepository.save(new User(Long.valueOf(2), "Jack", "Nicklson", new Date(), userCustomerType));
      userRepository.save(new User(Long.valueOf(3), "John", "Doe", new Date(), userAffiliateType));
      userRepository.save(new User(Long.valueOf(4), "Reem", "Abdallah", new Date(), userEmployeeType));
    };
  }

  public UserTypeEntity getCustomerType() {
    return new UserTypeEntity(Integer.valueOf(1), "Customer", "Customer type");
  }

  public UserTypeEntity getAffiliateType() {
    return new UserTypeEntity(Integer.valueOf(2), "Affiliate", "Affiliate type");
  }


  public UserTypeEntity getEmployeeType() {
    return new UserTypeEntity(Integer.valueOf(3), "Employee", "Employee type");
  }
}
