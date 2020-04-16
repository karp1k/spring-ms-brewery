package guru.springframework.springmsbrewery.web.model;

import lombok.*;

import java.util.UUID;

/**
 * @author kas
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDto {

    private UUID id;
    private String name;
}
