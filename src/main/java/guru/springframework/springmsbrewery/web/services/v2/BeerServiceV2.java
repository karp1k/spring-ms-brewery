package guru.springframework.springmsbrewery.web.services.v2;

import guru.springframework.springmsbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

/**
 * @author kas
 */
public interface BeerServiceV2 {

    BeerDtoV2 getBeerDto(UUID id);

    BeerDtoV2 save(BeerDtoV2 beerDto);

    void updateBeer(UUID beerId, BeerDtoV2 beerDto);

    void deleteById(UUID beerId);
}
