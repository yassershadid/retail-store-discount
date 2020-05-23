package com.retail.store.discount.service.netamountcalculator;

import java.math.BigDecimal;
import java.util.Date;

public class AffiliateNetAmountCalculator extends NetAmountCalculatorBase {

  @Override
  public BigDecimal getDiscountPercentageOnNonGroceryItems(Date createdDate) {
    return BigDecimal.valueOf(0.9).setScale(2);
  }
}
