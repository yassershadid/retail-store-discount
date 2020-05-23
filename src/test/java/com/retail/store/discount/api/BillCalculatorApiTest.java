package com.retail.store.discount.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.retail.store.discount.api.request.CalculateNetPayableRequest;
import com.retail.store.discount.api.request.ItemRequest;
import com.retail.store.discount.service.BillCalculatorService;
import com.retail.store.discount.service.model.BillInfo;
import com.retail.store.discount.service.model.ItemType;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.ArgumentMatchers.anyCollection;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = {BillCalculatorApi.class})
public class BillCalculatorApiTest {

  private static final String CALCULATE_NET_PAYABLE_URL = "/api/v1/bill/calculate-net-payable";

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private BillCalculatorService billCalculatorService;

  @Test
  public void testCalculateNetPayableWhenUserIdIsNull() throws Exception {
    Mockito.when(billCalculatorService.nonUserExist(anyLong())).thenReturn(false);

    mockMvc.perform(post(CALCULATE_NET_PAYABLE_URL)
        .contentType(MediaType.APPLICATION_JSON_VALUE)
        .accept(MediaType.APPLICATION_JSON_VALUE)
        .content(new ObjectMapper().writeValueAsString(aCalculateNetPayableRequestWithoutUserId())))
        .andExpect(status().isBadRequest())
        .andExpect(content().string(containsString("User id should be provide in calculate net payable request")));
  }

  @Test
  public void testCalculateNetPayableWhenItemRequestsIsNull() throws Exception {
    Mockito.when(billCalculatorService.nonUserExist(anyLong())).thenReturn(false);

    mockMvc.perform(post(CALCULATE_NET_PAYABLE_URL)
        .contentType(MediaType.APPLICATION_JSON_VALUE)
        .accept(MediaType.APPLICATION_JSON_VALUE)
        .content(new ObjectMapper().writeValueAsString(aCalculateNetPayableRequestWithoutItemRequests())))
        .andExpect(status().isBadRequest())
        .andExpect(content().string(containsString("Bill items cannot be empty")));
  }

  @Test
  public void testCalculateNetPayableWhenUserDoesNotExist() throws Exception {
    Mockito.when(billCalculatorService.nonUserExist(anyLong())).thenReturn(true);

    mockMvc.perform(post(CALCULATE_NET_PAYABLE_URL)
        .contentType(MediaType.APPLICATION_JSON_VALUE)
        .accept(MediaType.APPLICATION_JSON_VALUE)
        .content(new ObjectMapper().writeValueAsString(aCalculateNetPayableRequest())))
        .andExpect(status().isBadRequest())
        .andExpect(content().string(containsString("User [1] does not exist")));
  }

  @Test
  public void testCalculateNetPayableWhen() throws Exception {
    Mockito.when(billCalculatorService.calculateNetPayable(anyLong(), anyCollection())).thenReturn(aBillInfo());

    mockMvc.perform(post(CALCULATE_NET_PAYABLE_URL)
        .contentType(MediaType.APPLICATION_JSON_VALUE)
        .accept(MediaType.APPLICATION_JSON_VALUE)
        .content(new ObjectMapper().writeValueAsString(aCalculateNetPayableRequest())))
        .andExpect(status().isOk())
        .andExpect(content().string(containsString("{\"totalAmount\":800,\"netAmount\":760}")));
  }

  private BillInfo aBillInfo() {
    return BillInfo.builder().netAmount(new BigDecimal(760)).totalAmount(new BigDecimal(800)).build();
  }

  private CalculateNetPayableRequest aCalculateNetPayableRequestWithoutUserId() {
    final CalculateNetPayableRequest calculateNetPayableRequest = new CalculateNetPayableRequest();
    calculateNetPayableRequest.setItems(getMixedItemsRequest());
    return calculateNetPayableRequest;
  }


  private CalculateNetPayableRequest aCalculateNetPayableRequestWithoutItemRequests() {
    final CalculateNetPayableRequest calculateNetPayableRequest = new CalculateNetPayableRequest();
    calculateNetPayableRequest.setUserId(Long.valueOf(1));
    return calculateNetPayableRequest;
  }

  private CalculateNetPayableRequest aCalculateNetPayableRequest() {
    final CalculateNetPayableRequest calculateNetPayableRequest = new CalculateNetPayableRequest();
    calculateNetPayableRequest.setUserId(Long.valueOf(1));
    calculateNetPayableRequest.setItems(getMixedItemsRequest());
    return calculateNetPayableRequest;
  }

  private Collection<ItemRequest> getMixedItemsRequest() {
    return Arrays.asList(getGroceryItemRequest(), getOthersItemRequest());
  }

  private ItemRequest getGroceryItemRequest() {
    return new ItemRequest("Grocery1", ItemType.GROCERY, new BigDecimal(200));
  }

  private ItemRequest getOthersItemRequest() {
    return new ItemRequest("Other1", ItemType.OTHERS, new BigDecimal(200));
  }
}
