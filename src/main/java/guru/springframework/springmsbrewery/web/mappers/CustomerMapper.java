package guru.springframework.springmsbrewery.web.mappers;

import guru.springframework.springmsbrewery.domain.Customer;
import guru.springframework.springmsbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

/**
 * @author kas
 */
@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);
    Customer customerDtoToCustomer(CustomerDto customerDto);
}
