package thomas.springframework.sfgrestdocsexample.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import thomas.springframework.sfgrestdocsexample.domain.Beer;
import thomas.springframework.sfgrestdocsexample.repositories.BeerRepository;
import thomas.springframework.sfgrestdocsexample.web.model.BeerStyleEnum;

import java.math.BigDecimal;

/**
 * @author vvthuy on 12/28/2020
 * @project sfg-restdocs-example
 */
@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if (beerRepository.count() == 0) {

            beerRepository.save(Beer.builder()
            .beerName("Mango Bobs")
            .beerStyle(BeerStyleEnum.IPA)
            .quantityToBrew(200)
            .minOnHand(12)
            .upc(33701000001L)
            .price(new BigDecimal("12.95"))
            .build());

            beerRepository.save(Beer.builder()
                    .beerName("Galaxy cat")
                    .beerStyle(BeerStyleEnum.PALE_ALE)
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .upc(337010000021L)
                    .price(new BigDecimal("11.95"))
                    .build());
        }
    }

}
