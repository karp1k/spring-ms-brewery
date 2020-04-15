package guru.springframework.springmsbrewery.web.services;

import guru.springframework.springmsbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author kas
 */
@Slf4j
@Component
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerDto(UUID id) {
        return CustomerDto.builder().id(id).name("Jane").build();
    }

    @Override
    public CustomerDto save(CustomerDto customerDto) {
        return customerDto;
    }

    @Override
    public void update(UUID id, CustomerDto customerDto) {
        //todo impl
    }

    @Override
    public void delete(UUID id) {
        //todo impl
    }
}
