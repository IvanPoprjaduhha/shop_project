package de.ait_tr.g_37_jp_shop.controller;

import de.ait_tr.g_37_jp_shop.domain.dto.CustomerDto;
import de.ait_tr.g_37_jp_shop.domain.entity.Customer;
import de.ait_tr.g_37_jp_shop.service.interfaces.CustomerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @GetMapping
    public CustomerDto getById(@RequestParam Long id) {
        return service.getById(id);
    }

    public CustomerDto save(@RequestBody CustomerDto customer) {
        return service.save(customer);
    }
}
