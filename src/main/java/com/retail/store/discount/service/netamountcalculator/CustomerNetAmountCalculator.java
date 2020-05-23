package com.retail.store.discount.service.netamountcalculator;

import java.math.BigDecimal;
import java.math.MathContext;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class CustomerNetAmountCalculator extends NetAmountCalculatorBase {

  @Override
  public BigDecimal getDiscountPercentageOnNonGroceryItems(Date createdDate) {
    Period period = Period.between(convertToLocalDate(createdDate), LocalDate.now());
    if (period.getYears() >= 2) {
      return BigDecimal.valueOf( 0.950).round(new MathContext(2));
    }

    return BigDecimal.ONE.setScale(2);
  }

  public LocalDate convertToLocalDate(Date dateToConvert) {
    return Instant.ofEpochMilli(dateToConvert.getTime())
        .atZone(ZoneId.systemDefault())
        .toLocalDate();
  }
}
