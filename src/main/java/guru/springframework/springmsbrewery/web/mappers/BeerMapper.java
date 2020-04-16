package guru.springframework.springmsbrewery.web.mappers;

import guru.springframework.springmsbrewery.domain.Beer;
import guru.springframework.springmsbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * @author kas
 */
@Mapper
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto dto);
}
