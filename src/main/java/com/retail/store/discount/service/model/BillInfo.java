package com.retail.store.discount.service.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class BillInfo {
  private BigDecimal totalAmount;
  private BigDecimal netAmount;
}
