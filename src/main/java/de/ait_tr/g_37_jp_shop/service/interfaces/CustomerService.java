package de.ait_tr.g_37_jp_shop.service.interfaces;

import de.ait_tr.g_37_jp_shop.domain.dto.CustomerDto;
import de.ait_tr.g_37_jp_shop.domain.entity.Customer;

import java.util.List;


public interface CustomerService {

    CustomerDto save (CustomerDto customer);

    List<CustomerDto> getAll();

    CustomerDto getById(Long id);

    void update (CustomerDto customer);

    void deleteById( Long id);

    void deleteByName(String name);

    void restoreById(Long id);

    int getTotalQuantity();

}
