package com.retail.store.discount.service.netamountcalculator;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Date;

public class EmployeeNetAmountCalculator extends NetAmountCalculatorBase {

  @Override
  public BigDecimal getDiscountPercentageOnNonGroceryItems(Date createdDate) {
    return BigDecimal.valueOf(0.7).setScale(2);
  }
}
