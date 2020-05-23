package com.retail.store.discount.service.netamountcalculator;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Date;

public class EmployeeNetAmountCalculator extends NetAmountCalculatorBase {

  @Override
  public BigDecimal getDiscountPercentageOnNonGroceryItems(Date createdDate) {
    return new BigDecimal(0.7, new MathContext(2));
  }
}
