package guru.springframework.springmsbrewery.domain;

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
public class Customer {

    private UUID id;
    private String name;
}
