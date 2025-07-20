package com.example.springboot_crashcourse.session3.lab9;

import com.example.springboot_crashcourse.session3.lab6.model.Product;
import com.example.springboot_crashcourse.session3.lab7.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class ProductController9 {
    private final ProductRepository productRepository;

    @GetMapping(path = "/products9")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping(path = "/products9/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Optional<Product> product = productRepository.findById(id);

        if (product.isPresent()) {
            return ResponseEntity.ok(product.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
