package ginogipsy.springframework.msscbeerservice.web.mappers;

import ginogipsy.springframework.msscbeerservice.domain.Beer;
import ginogipsy.springframework.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * Created by ginogipsy on 2023-03-29
 */
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto beerDto);
}
