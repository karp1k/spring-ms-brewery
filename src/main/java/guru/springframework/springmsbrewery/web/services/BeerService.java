package guru.springframework.springmsbrewery.web.services;

import guru.springframework.springmsbrewery.web.model.BeerDto;

import java.util.UUID;

/**
 * @author kas
 */
public interface BeerService {

    BeerDto getBeerDto(UUID id);

    BeerDto save(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);
}
