package thomas.springframework.sfgrestdocsexample.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import thomas.springframework.sfgrestdocsexample.domain.Beer;

import java.util.UUID;

/**
 * @author vvthuy on 12/28/2020
 * @project sfg-restdocs-example
 */
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
