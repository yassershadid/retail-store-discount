package com.retail.store.discount.service.netamountcalculator;

import com.retail.store.discount.service.model.Item;
import com.retail.store.discount.service.model.ItemType;
import com.retail.store.discount.service.model.UserType;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;

public class NetAmountCalculatorTest {

  private NetAmountCalculator netAmountCalculator = new NetAmountCalculator();

  @Test
  public void testCalculateWhenUserTypeIsNull() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      netAmountCalculator.calculate(null, new Date(), Collections.emptyList());
    });
  }

  @Test
  public void testCalculateWhenUserTypeIsCustomer() {
    Assert.assertEquals(new BigDecimal(760).setScale(2), netAmountCalculator.calculate(UserType.CUSTOMER, new Date(), getListOfItems()));
  }

  @Test
  public void testCalculateWhenUserTypeMoreThanTwoYearsCustomer() {
    LocalDate localDate = LocalDate.now().minusYears(3);
    Date beforeTwoYearsDate = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

    Assert.assertEquals(new BigDecimal(745).setScale(2), netAmountCalculator.calculate(UserType.CUSTOMER, beforeTwoYearsDate, getListOfItems()));
  }

  @Test
  public void testCalculateWhenUserTypeIsEmployee() {
    Assert.assertEquals(new BigDecimal(650).setScale(2), netAmountCalculator.calculate(UserType.EMPLOYEE, new Date(), getListOfItems()));
  }

  @Test
  public void testCalculateWhenUserTypeIsAffiliate() {
    Assert.assertEquals(new BigDecimal(725).setScale(2), netAmountCalculator.calculate(UserType.AFFILIATE, new Date(), getListOfItems()));
  }

  private Collection<Item> getListOfItems() {
    final Collection<Item> items = new ArrayList<>();
    items.add(new Item(new BigDecimal(200), ItemType.GROCERY));
    items.add(new Item(new BigDecimal(200), ItemType.GROCERY));
    items.add(new Item(new BigDecimal(200), ItemType.OTHERS));
    items.add(new Item(new BigDecimal(200), ItemType.OTHERS));
    return items;
  }
}
