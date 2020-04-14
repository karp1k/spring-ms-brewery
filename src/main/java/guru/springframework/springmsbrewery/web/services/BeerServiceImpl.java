package guru.springframework.springmsbrewery.web.services;

import guru.springframework.springmsbrewery.web.model.BeerDto;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author kas
 */
@Component
public class BeerServiceImpl implements BeerService {



    @Override
    public BeerDto getBeerDto(UUID id) {
        return BeerDto.builder().id(id).beerName("Pilsner").beerStyle("Dark").build();
    }
}
