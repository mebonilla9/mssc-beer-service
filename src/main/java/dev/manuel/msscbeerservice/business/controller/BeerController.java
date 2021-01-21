package dev.manuel.msscbeerservice.business.controller;

import dev.manuel.msscbeerservice.model.dto.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Validated
@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

  @GetMapping("/{beerId}")
  public ResponseEntity<BeerDto> getBeerById(@NotNull @PathVariable("beerId") UUID beerId) {
    //TODO impl
    return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity saveNewBeer(@Valid @NotNull @RequestBody BeerDto beerDto) {
    //TODO impl
    return new ResponseEntity(HttpStatus.CREATED);
  }

  @PutMapping("/{beerId}")
  public ResponseEntity updateBeerById(@NotNull @PathVariable("beerId") UUID beerId, @Valid @NotNull @RequestBody BeerDto beerDto) {
    //TODO impl
    return new ResponseEntity(HttpStatus.NO_CONTENT);
  }
}
