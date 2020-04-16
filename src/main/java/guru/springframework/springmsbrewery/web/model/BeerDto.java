package guru.springframework.springmsbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * @author kas
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    /*It should not always be null.
    It should be null at the time when the object is being validated.
    Imagine a field that is part of the class,
    but must not be submitted by the user because
    it's computed and added later to the object, for example.*/
    @Null
    private UUID id;
    @NotBlank
    private String beerName;
    @NotBlank
    private String beerStyle;
    @Positive
    private Long upc;

    private OffsetDateTime createdDate;
    private OffsetDateTime lastUpdateDate;
}
