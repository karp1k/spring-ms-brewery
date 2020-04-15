package guru.springframework.springmsbrewery.web.services;

import guru.springframework.springmsbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author kas
 */
@Slf4j
@Component
public class BeerServiceImpl implements BeerService {



    @Override
    public BeerDto getBeerDto(UUID id) {
        return BeerDto.builder().id(id).beerName("Pilsner").beerStyle("Dark").build();
    }

    @Override
    public BeerDto save(BeerDto beerDto) {
        return BeerDto.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //todo impl update method
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("deleting entity...");
        //todo impl delete method
    }
}
