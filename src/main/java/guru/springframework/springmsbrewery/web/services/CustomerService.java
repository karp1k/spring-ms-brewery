package guru.springframework.springmsbrewery.web.services;

import guru.springframework.springmsbrewery.web.model.CustomerDto;

import java.util.UUID;

/**
 * @author kas
 */
public interface CustomerService {

    CustomerDto getCustomerDto(UUID id);

    CustomerDto save(CustomerDto customerDto);

    void update(UUID id, CustomerDto customerDto);

    void delete(UUID id);
}
