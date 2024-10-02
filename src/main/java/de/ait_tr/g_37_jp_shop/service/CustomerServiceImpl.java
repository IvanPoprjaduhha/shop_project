package de.ait_tr.g_37_jp_shop.service;

import de.ait_tr.g_37_jp_shop.domain.dto.CustomerDto;
import de.ait_tr.g_37_jp_shop.domain.entity.Customer;
import de.ait_tr.g_37_jp_shop.repository.CustomerRepository;
import de.ait_tr.g_37_jp_shop.service.interfaces.CustomerService;
import de.ait_tr.g_37_jp_shop.service.mapping.CustomerMappingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository repository;
    private CustomerMappingService mappingService;

    public CustomerServiceImpl(CustomerRepository repository, CustomerMappingService mappingService) {
        this.repository = repository;
        this.mappingService = mappingService;
    }

    @Override
    public CustomerDto save(CustomerDto customer) {
        return null;
    }

    @Override
    public List<CustomerDto> getAll() {
        return null;
    }

    @Override
    public CustomerDto getById(Long id) {
        if (id == null || id < 1) {
            throw new RuntimeException("Customer ID is incorrect");
        }
        Customer customer = repository.findById(id).orElse(null);

        if (customer == null) {
            throw new RuntimeException("Customer not found");
        }
        return mappingService.mapEntityToDto(customer);
    }

    @Override
    public void update(CustomerDto customer) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void deleteByName(String name) {

    }

    @Override
    public void restoreById(Long id) {

    }

    @Override
    public int getTotalQuantity() {
        return 0;
    }
}
