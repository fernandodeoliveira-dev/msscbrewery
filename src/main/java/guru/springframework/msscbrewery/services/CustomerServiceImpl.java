package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Fernando")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto beerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID CustomerId, CustomerDto beerDto) {

    }

    @Override
    public void deleteCustomer(UUID bCustomerId) {

    }
}
