package com.retail.store.discount.service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class Item {
  private final BigDecimal amount;
  private final ItemType type;

  public boolean isGrocery() {
    return ItemType.GROCERY == type;
  }

  public boolean isNotGrocery() {
    return !isGrocery();
  }
}
