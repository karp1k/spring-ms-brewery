package guru.springframework.springmsbrewery.domain;

import guru.springframework.springmsbrewery.web.model.v2.BeerStyle;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.UUID;

/**
 * @author kas
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Beer {

    private UUID id;
    private String beerName;
    private BeerStyle beerStyle;
    private Long upc;
    private Timestamp createdDate;
    private Timestamp lastUpdateDate;
}
