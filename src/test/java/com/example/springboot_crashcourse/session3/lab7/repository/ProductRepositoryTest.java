package com.example.springboot_crashcourse.session3.lab7.repository;

import com.example.springboot_crashcourse.session3.lab6.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

    private ProductRepository productRepository;

    @BeforeEach
    void setUp() {
        productRepository = new ProductRepository();
    }

    @Test
    @DisplayName("findAll() should return the default list of products")
    void testFindAll() {
        List<Product> products = productRepository.findAll();

        assertNotNull(products);
        assertEquals(3, products.size(), "Expected 3 default products");
    }

    @Test
    @DisplayName("findById() should return a product when given a valid ID")
    void testFindByIdValid() {
        Optional<Product> productOpt = productRepository.findById(1L);

        assertTrue(productOpt.isPresent());
        assertEquals("Laptop", productOpt.get().getName());
    }

    @Test
    @DisplayName("findById() should return empty when given an invalid ID")
    void testFindByIdInvalid() {
        Optional<Product> productOpt = productRepository.findById(999L);
        assertTrue(productOpt.isEmpty());
    }

    @Test
    @DisplayName("save() should add a new product and assign an ID")
    void testSaveNewProduct() {
        Product newProduct = new Product(null, "Monitor", 200.00);
        Product savedProduct = productRepository.save(newProduct);

        assertNotNull(savedProduct.getId(), "ID should be auto-generated");
        assertEquals("Monitor", savedProduct.getName());
        assertEquals(4, productRepository.findAll().size(), "Should now have 4 products");
    }

    @Test
    @DisplayName("save() should update an existing product if ID exists")
    void testSaveExistingProduct() {
        Product updatedProduct = new Product(1L, "Gaming Laptop", 1500.00);
        Product result = productRepository.save(updatedProduct);

        assertEquals(1L, result.getId());
        assertEquals("Gaming Laptop", result.getName());

        Optional<Product> fromRepo = productRepository.findById(1L);
        assertTrue(fromRepo.isPresent());
        assertEquals("Gaming Laptop", fromRepo.get().getName());
    }

    @Test
    @DisplayName("save() with a non-matching ID should not add a new product")
    void testSaveWithInvalidIdDoesNotAdd() {
        Product fakeUpdate = new Product(99L, "Nonexistent", 999.99);
        productRepository.save(fakeUpdate);

        List<Product> products = productRepository.findAll();
        assertEquals(3, products.size(), "Should still have 3 products (no new added)");
    }
}
