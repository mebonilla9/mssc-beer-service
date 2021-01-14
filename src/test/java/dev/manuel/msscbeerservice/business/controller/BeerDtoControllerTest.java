package dev.manuel.msscbeerservice.business.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.manuel.msscbeerservice.model.dto.BeerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(BeerController.class)
class BeerDtoControllerTest {

  private final String uriBase = "/api/v1/beer/";

  @Autowired
  MockMvc mockMvc;

  @Autowired
  ObjectMapper objectMapper;

  @Test
  void getBeerByIdTest() throws Exception {
    mockMvc.perform(get(uriBase + UUID.randomUUID().toString())
        .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }

  @Test
  void saveNewBeerTest() throws Exception {
    BeerDto beerDto = BeerDto.builder().build();
    String beerJson = objectMapper.writeValueAsString(beerDto);

    mockMvc.perform(post(uriBase)
        .contentType(MediaType.APPLICATION_JSON)
        .content(beerJson))
        .andExpect(status().isCreated());
  }

  @Test
  void updateBeerByIdTest() throws Exception {
    BeerDto beerDto = BeerDto.builder().build();
    String beerJson = objectMapper.writeValueAsString(beerDto);

    mockMvc.perform(put(uriBase + UUID.randomUUID().toString())
        .contentType(MediaType.APPLICATION_JSON)
        .content(beerJson))
        .andExpect(status().isNoContent());
  }
}