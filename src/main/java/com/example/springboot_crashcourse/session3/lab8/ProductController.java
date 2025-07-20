package com.example.springboot_crashcourse.session3.lab8;

import com.example.springboot_crashcourse.session3.lab6.model.Product;
import com.example.springboot_crashcourse.session3.lab7.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductRepository productRepository;

    @GetMapping(path = "/products")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

}
