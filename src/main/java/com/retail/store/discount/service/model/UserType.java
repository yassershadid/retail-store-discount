package com.retail.store.discount.service.model;

import lombok.Getter;

import java.util.Arrays;
import java.util.Optional;

@Getter
public enum UserType {
  CUSTOMER(Integer.valueOf(1)), AFFILIATE(Integer.valueOf(2)), EMPLOYEE(Integer.valueOf(3));

  private Integer id;

  UserType(Integer id) {
    this.id = id;
  }

  public static UserType getUserType(Integer typeId) {
    Optional<UserType> userTypeOptional = Arrays.stream(values())
        .filter(userType -> userType.getId().equals(typeId))
        .findAny();

    if (!userTypeOptional.isPresent()) {
      return null;
    }

    return userTypeOptional.get();
  }

}
