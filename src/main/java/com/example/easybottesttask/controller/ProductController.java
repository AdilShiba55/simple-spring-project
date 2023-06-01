package com.example.easybottesttask.controller;

import com.example.easybottesttask.dto.ProductDTO;
import com.example.easybottesttask.entity.Product;
import com.example.easybottesttask.exception.RecordNotFoundException;
import com.example.easybottesttask.repository.ProductRepository;
import com.example.easybottesttask.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public Long save(@RequestBody @Valid ProductDTO productDTO) {
        Product product = productService.save(productDTO);
        return product.getId();
    }

    @GetMapping
    public List<Product> all() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id) {
        return productService.findById(id);
    }

    @GetMapping("/type/{id}")
    public List<Product> getByType(@PathVariable Long id) {
        return productService.getByProductType(id);
    }

}
