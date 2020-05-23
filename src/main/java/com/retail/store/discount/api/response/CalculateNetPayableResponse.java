package com.retail.store.discount.api.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class CalculateNetPayableResponse {
  private BigDecimal totalAmount;
  private BigDecimal netAmount;
}
