package guru.springframework.springmsbrewery.web.services.v2;

import guru.springframework.springmsbrewery.web.model.v2.BeerDtoV2;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author kas
 */
@Component
public class BeerServiceV2Impl implements BeerServiceV2 {

    @Override
    public BeerDtoV2 getBeerDto(UUID id) {
        return BeerDtoV2.builder().id(id).build();
    }

    @Override
    public BeerDtoV2 save(BeerDtoV2 beerDto) {
        return beerDto;
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {

    }

    @Override
    public void deleteById(UUID beerId) {

    }
}
