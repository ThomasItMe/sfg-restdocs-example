package thomas.springframework.sfgrestdocsexample.web.mappers;

import org.mapstruct.Mapper;
import thomas.springframework.sfgrestdocsexample.domain.Beer;
import thomas.springframework.sfgrestdocsexample.web.model.BeerDto;

/**
 * @author vvthuy on 12/28/2020
 * @project sfg-restdocs-example
 */
@Mapper(componentModel = "spring",uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
