package com.retail.store.discount.api;

import com.retail.store.discount.api.request.CalculateNetPayableRequest;
import com.retail.store.discount.api.request.ItemRequest;
import com.retail.store.discount.api.response.CalculateNetPayableResponse;
import com.retail.store.discount.service.BillCalculatorService;
import com.retail.store.discount.service.model.BillInfo;
import com.retail.store.discount.service.model.Item;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/bill")
public class BillCalculatorApi {

  private static final Logger LOGGER = LogManager.getLogger(BillCalculatorApi.class);

  @Autowired
  private BillCalculatorService billCalculatorService;

  @PostMapping(value = "/calculate-net-payable", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<CalculateNetPayableResponse> calculateNetPayable(@RequestBody CalculateNetPayableRequest calculateNetPayableRequest) {
    validateCalculateNetPayable(calculateNetPayableRequest);
    BillInfo billInfo = billCalculatorService.calculateNetPayable(calculateNetPayableRequest.getUserId(), convertToItems(calculateNetPayableRequest.getItems()));
    return ResponseEntity.ok(new CalculateNetPayableResponse(billInfo.getTotalAmount(), billInfo.getNetAmount()));
  }

  private Collection<Item> convertToItems(Collection<ItemRequest> itemsRequest) {
    return itemsRequest.stream()
        .map(itemRequest -> new Item(itemRequest.getAmount(), itemRequest.getType()))
        .collect(Collectors.toList());
  }

  private void validateCalculateNetPayable(CalculateNetPayableRequest calculateNetPayableRequest) {
    if (Objects.isNull(calculateNetPayableRequest.getUserId())) {
      throw new IllegalArgumentException("User id should be provide in calculate net payable request");
    }

    if (billCalculatorService.nonUserExist(calculateNetPayableRequest.getUserId())) {
      throw new IllegalArgumentException("User [" + calculateNetPayableRequest.getUserId() + "] does not exist");
    }

    if (Objects.isNull(calculateNetPayableRequest.getItems()) || calculateNetPayableRequest.getItems().isEmpty()) {
      throw new IllegalArgumentException("Bill items cannot be empty");
    }
  }

}
