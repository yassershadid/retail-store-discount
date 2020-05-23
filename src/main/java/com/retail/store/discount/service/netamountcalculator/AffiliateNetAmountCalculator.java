package com.retail.store.discount.service.netamountcalculator;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Date;

public class AffiliateNetAmountCalculator extends NetAmountCalculatorBase {

  @Override
  public BigDecimal getDiscountPercentageOnNonGroceryItems(Date createdDate) {
    return new BigDecimal(0.9, new MathContext(2));
  }
}
