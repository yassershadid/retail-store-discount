package com.retail.store.discount.api.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@AllArgsConstructor
@Getter
public class ApiErrorResponse {
  private final String status;
  private final Integer code;
  private final String message;
  private final Date date;
}
