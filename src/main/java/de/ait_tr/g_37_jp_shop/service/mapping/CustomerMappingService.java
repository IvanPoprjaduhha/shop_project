package de.ait_tr.g_37_jp_shop.service.mapping;

import de.ait_tr.g_37_jp_shop.domain.dto.CustomerDto;
import de.ait_tr.g_37_jp_shop.domain.entity.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerMappingService {
    //  Manual mapping without Mapstruckt
    public CustomerDto mapEntityToDto(Customer entity) {
        CustomerDto dto = new CustomerDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    public Customer mapDtoToEntity(CustomerDto dto) {
        Customer customer = new Customer();

        customer.setName(dto.getName());
        return customer;
    }


}
