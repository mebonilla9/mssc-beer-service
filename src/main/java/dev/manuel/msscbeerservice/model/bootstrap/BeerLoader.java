package dev.manuel.msscbeerservice.model.bootstrap;

import dev.manuel.msscbeerservice.model.entities.Beer;
import dev.manuel.msscbeerservice.model.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

  private final BeerRepository beerRepository;

  public BeerLoader(BeerRepository beerRepository) {
    this.beerRepository = beerRepository;
  }

  @Override
  public void run(String... args) throws Exception {
    loadBeerObjects();
  }

  private void loadBeerObjects() {
    if (beerRepository.count() == 0){
      beerRepository.save(Beer.builder()
          .name("Mango Bobs")
          .style("IPA")
          .quantityToBrew(200)
          .minOnHand(12)
          .upc(337010000001L)
          .price(new BigDecimal("12.95"))
          .build()
      );

      beerRepository.save(Beer.builder()
          .name("Galaxy Cat")
          .style("PALE_ALE")
          .quantityToBrew(200)
          .minOnHand(12)
          .upc(337010000002L)
          .price(new BigDecimal("11.95"))
          .build()
      );

      System.out.println("Count of beer: "+beerRepository.count());
    }
  }
}
