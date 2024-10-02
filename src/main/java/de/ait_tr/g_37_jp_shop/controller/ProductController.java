package de.ait_tr.g_37_jp_shop.controller;

import de.ait_tr.g_37_jp_shop.domain.dto.ProductDto;
import de.ait_tr.g_37_jp_shop.service.interfaces.ProductService;
import org.springframework.web.bind.annotation.*;

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

    // GET - localhost:8080/products/example?id=5
    @GetMapping
    public ProductDto getbyId(@RequestParam Long id) {
        return service.getById(id);
    }

    @PostMapping
    public ProductDto save (@RequestBody ProductDto product){
        return service.save(product);
    }
}
