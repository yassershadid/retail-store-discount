package com.retail.store.discount.api.request;

import com.retail.store.discount.service.model.ItemType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemRequest {
  private String name;
  private ItemType type;
  private BigDecimal amount;
}
