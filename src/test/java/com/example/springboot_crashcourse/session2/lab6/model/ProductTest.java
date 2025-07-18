package com.example.springboot_crashcourse.session2.lab6.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    private Product product;

    @BeforeEach
    void setUp() {
        product = new Product("Ralph", 1000);
    }

    @AfterEach
    void reset() {
        product.setName(null);
        product.setPrice(0.0);
        product.setId(null);
    }

    @Test
    void testInitializedNameAndPrice() {
        assertEquals("Ralph", product.getName());
        assertEquals(1000, product.getPrice());
    }

    @Test
    void testPositiveIntegerPrice() {
        double expectedPrice = 2000;

        product.setPrice(2000);
        assertEquals(expectedPrice, product.getPrice());
    }

    @Test
    void testIDWithPositiveInteger() {
        Long expectedID = 12345L;

        assertNull(product.getId());
        product.setId(expectedID);
        assertEquals(expectedID, product.getId());
    }

    @Test
    void testName() {
        String expectedName = "Daniel";

        assertEquals("Ralph", product.getName());
        product.setName("Daniel");
        assertEquals(expectedName, product.getName());
    }

    @Test
    void testHashCode() {
        Product firstProduct = new Product("test", 2000);
        Product secondProduct = new Product("test", 2000);

        assertEquals(firstProduct.hashCode(), secondProduct.hashCode());
    }

    @Test
    void testProductToString() {
        String expected = "Product{" +
                "id=" + "12345" +
                ", name='" + "Ralph" + '\'' +
                ", price=" + "1000.0" +
                '}';

        product.setName("Ralph");
        product.setId(12345L);
        product.setPrice(1000);

        assertEquals(expected, product.toString());
    }

    @Test
    void testEquals() {
        Product firstProduct = new Product("test", 2000);
        Product secondProduct = new Product("test", 2000);

        assertEquals(firstProduct.hashCode(), secondProduct.hashCode());
    }
}