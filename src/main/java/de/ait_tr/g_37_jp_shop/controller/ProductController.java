package de.ait_tr.g_37_jp_shop.controller;

import de.ait_tr.g_37_jp_shop.domain.dto.ProductDto;
import de.ait_tr.g_37_jp_shop.service.interfaces.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

//    // GET - localhost:8080/products/example/5
//    @GetMapping("/example/{id}")
//    public Product getbyId(@PathVariable Long id) {
//        return service.getById(id);
//    }

//  List of products will be visible to all users, also not registered
    @GetMapping("/all")
    public List<ProductDto> getAll() {
        return service.getAll();
    }

    // GET - localhost:8080/products/example?id=5
    // To add or manipulate selected product can only be done by registered user

    @GetMapping
    public ProductDto getbyId(@RequestParam Long id) {
        return service.getById(id);
    }

    // To add and save new products can only user with role ADMIN
    @PostMapping
    public ProductDto save(@RequestBody ProductDto product) {
        return service.save(product);
    }

}

