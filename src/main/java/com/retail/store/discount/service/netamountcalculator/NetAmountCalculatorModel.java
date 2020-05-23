package com.retail.store.discount.service.netamountcalculator;

import com.retail.store.discount.service.model.Item;
import com.retail.store.discount.service.model.UserType;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

interface NetAmountCalculatorModel {

  BigDecimal calculate(UserType userType, Date createdDate, Collection<Item> items);

  BigDecimal getDiscountPercentageOnNonGroceryItems(Date createdDate);
}
