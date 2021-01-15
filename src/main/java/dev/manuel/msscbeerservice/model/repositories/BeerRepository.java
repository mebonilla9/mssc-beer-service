package dev.manuel.msscbeerservice.model.repositories;

import dev.manuel.msscbeerservice.model.entities.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
