package guru.springframework.springmsbrewery.web.model.v2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * @author kas
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BeerDtoV2 {
    private UUID id;
    private String beerName;
    private BeerStyle beerStyle;
    private Long upc;
}
