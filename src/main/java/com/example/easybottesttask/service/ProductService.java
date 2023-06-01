package com.example.easybottesttask.service;

import com.example.easybottesttask.dto.ProductDTO;
import com.example.easybottesttask.entity.Product;
import com.example.easybottesttask.entity.ProductType;
import com.example.easybottesttask.exception.RecordNotFoundException;
import com.example.easybottesttask.repository.ProductRepository;
import com.example.easybottesttask.repository.ProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductTypeRepository productTypeRepository;

    @Transactional
    public Product save(ProductDTO productDTO) {
        ProductType productType = productTypeRepository.findById(productDTO.getProductTypeId())
                .orElseThrow(RecordNotFoundException::new);

        Product product = new Product();
        product.setId(product.getId());
        product.setName(productDTO.getName());
        product.setProductType(productType);
        product.setSerialNumber(productDTO.getSerialNumber());
        product.setManufacturer(productDTO.getManufacturer());
        product.setPrice(productDTO.getPrice());
        product.setCount(productDTO.getCount());

        return productRepository.save(product);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> product = productRepository.findById(id);
        return product.orElseThrow(RecordNotFoundException::new);
    }

    public List<Product> getByProductType(Long productType) {
        return productRepository.getByProductTypeId(productType);
    }

}
