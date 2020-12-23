package dev.manuel.msscbeerservice.business.controller;

import dev.manuel.msscbeerservice.model.dto.Beer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

  @GetMapping("/{beerId}")
  public ResponseEntity<Beer> getBeerById(@PathVariable("beerId") UUID beerId) {
    //TODO impl
    return new ResponseEntity<>(Beer.builder().build(), HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity saveNewBeer(@RequestBody Beer beer) {
    //TODO impl
    return new ResponseEntity(HttpStatus.CREATED);
  }

  @PutMapping("/{beerId}")
  public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId, @RequestBody Beer beer){
    //TODO impl
    return new ResponseEntity(HttpStatus.NO_CONTENT);
  }
}
