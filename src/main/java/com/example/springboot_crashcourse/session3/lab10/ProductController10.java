package com.example.springboot_crashcourse.session3.lab10;

import com.example.springboot_crashcourse.session3.lab6.model.Product;
import com.example.springboot_crashcourse.session3.lab7.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class ProductController10 {
    private final ProductRepository productRepository;

    @GetMapping(path = "/productss")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping(path = "/productss/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Optional<Product> product = productRepository.findById(id);

        if (product.isPresent()) {
            return ResponseEntity.ok(product.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/products")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        return ResponseEntity.status(HttpStatus.CREATED).body(productRepository.save(product));
    }
}
