package com.retail.store.discount.api.request;

import lombok.Data;

import java.util.Collection;

@Data
public class CalculateNetPayableRequest {
  private Long userId;
  private Collection<ItemRequest> items;
}
