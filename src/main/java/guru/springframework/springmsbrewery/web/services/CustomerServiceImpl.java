package guru.springframework.springmsbrewery.web.services;

import guru.springframework.springmsbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author kas
 */
@Component
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerDto(UUID id) {
        return CustomerDto.builder().id(id).name("Jane").build();
    }
}
