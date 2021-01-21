package dev.manuel.msscbeerservice.model.repositories;

import dev.manuel.msscbeerservice.model.entities.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
