package com.example.easybottesttask.service;

import com.example.easybottesttask.dto.ProductDTO;
import com.example.easybottesttask.entity.Product;
import com.example.easybottesttask.entity.ProductDetail;
import com.example.easybottesttask.entity.ProductDetailType;
import com.example.easybottesttask.entity.ProductType;
import com.example.easybottesttask.repository.ProductTypeRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Profile("test")
class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @Test
    void save() {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setName("Тест_Товар");
        productDTO.setProductTypeId(1L);
        productDTO.setPrice(1_000_000);
        productDTO.setCount(11);
        productDTO.setSerialNumber("111F");
        productDTO.setManufacturer("Huawei");
        Product product = productService.save(productDTO);
        Assertions.assertNotNull(product);
        Assertions.assertNotNull(product.getId());
    }

    @Test
    void findAll() {
        List<Product> products = productService.findAll();
        Assertions.assertTrue(products.size() > 0);
    }

    @Test
    void findById() {
        Long id = 1L;
        Product product = productService.findById(id);
        Assertions.assertNotNull(product);
        Assertions.assertNotNull(product.getId());
    }

    @Test
    void getByProductType() {
        Long id = 1L;
        List<Product> products = productService.getByProductType(id);
        Assertions.assertTrue(products.size() > 0);
    }
}
