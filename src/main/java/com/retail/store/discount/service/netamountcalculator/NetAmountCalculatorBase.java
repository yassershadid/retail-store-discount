package com.retail.store.discount.service.netamountcalculator;

import com.retail.store.discount.service.model.Item;
import com.retail.store.discount.service.model.UserType;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;

public abstract class NetAmountCalculatorBase implements NetAmountCalculatorModel {

  private static final BigDecimal HUNDRED_DISCOUNT_AMOUNT = new BigDecimal(5);
  private static final BigDecimal HUNDRED_DISCOUNT_THRESHOLD = new BigDecimal(100);

  @Override
  public BigDecimal calculate(UserType userType, Date createdDate, Collection<Item> items) {
    BigDecimal netAmountAfterPercentageDiscount = calculateNetAmountAfterPercentageDiscount(items, createdDate);
    int hundredFactor = netAmountAfterPercentageDiscount.divide(HUNDRED_DISCOUNT_THRESHOLD).intValue();
    BigDecimal hundredDiscountAmount = new BigDecimal(hundredFactor).multiply(HUNDRED_DISCOUNT_AMOUNT);
    return netAmountAfterPercentageDiscount.subtract(hundredDiscountAmount);
  }

  BigDecimal calculateNetAmountAfterPercentageDiscount(Collection<Item> items, Date createdDate) {
    return calculateNonGroceryItemsNetAmount(items, createdDate).add(calculateTotalGroceryItemsNetAmount(items));
  }

  BigDecimal calculateNonGroceryItemsNetAmount(Collection<Item> items, Date createdDate) {
    return calculateTotalNonGroceryItemsAmount(items).multiply(getDiscountPercentageOnNonGroceryItems(createdDate));
  }

  BigDecimal calculateTotalNonGroceryItemsAmount(Collection<Item> items) {
    return getNonGroceryItems(items).stream().map(Item::getAmount).collect(Collectors.reducing(BigDecimal.ZERO, BigDecimal::add));
  }

  Collection<Item> getNonGroceryItems(Collection<Item> items) {
    return items.stream().filter(Item::isNotGrocery).collect(Collectors.toList());
  }

  BigDecimal calculateTotalGroceryItemsNetAmount(Collection<Item> items) {
    return getGroceryItems(items).stream().map(Item::getAmount).collect(Collectors.reducing(BigDecimal.ZERO, BigDecimal::add));
  }


  Collection<Item> getGroceryItems(Collection<Item> items) {
    return items.stream().filter(Item::isGrocery).collect(Collectors.toList());
  }

}
