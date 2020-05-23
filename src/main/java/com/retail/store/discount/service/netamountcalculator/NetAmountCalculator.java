package com.retail.store.discount.service.netamountcalculator;

import com.retail.store.discount.service.model.Item;
import com.retail.store.discount.service.model.UserType;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class NetAmountCalculator {

  private static final Map<UserType, NetAmountCalculatorModel> USER_TYPE_NET_AMOUNT_CALCULATOR_MAP = new HashMap<>();

  public NetAmountCalculator() {
    init();
  }

  private void init() {
    USER_TYPE_NET_AMOUNT_CALCULATOR_MAP.put(UserType.EMPLOYEE, new EmployeeNetAmountCalculator());
    USER_TYPE_NET_AMOUNT_CALCULATOR_MAP.put(UserType.AFFILIATE, new AffiliateNetAmountCalculator());
    USER_TYPE_NET_AMOUNT_CALCULATOR_MAP.put(UserType.CUSTOMER, new CustomerNetAmountCalculator());
  }

  public BigDecimal calculate(UserType userType, Date createdDate, Collection<Item> items) {
    if (!USER_TYPE_NET_AMOUNT_CALCULATOR_MAP.containsKey(userType)) {
      throw new IllegalArgumentException("Cannot find net amount calculator for user type [" + userType + "]");
    }

    return USER_TYPE_NET_AMOUNT_CALCULATOR_MAP.get(userType).calculate(userType, createdDate, items);
  }
}
