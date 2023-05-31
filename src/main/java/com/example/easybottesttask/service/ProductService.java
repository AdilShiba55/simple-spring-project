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
    public Long save(ProductDTO productDTO) {
        ProductType productType = productTypeRepository.findById(productDTO.getProductTypeId())
                .orElseThrow(RecordNotFoundException::new);

        Product product = Product.builder()
                .name(productDTO.getName())
                .productType(productType)
                .serialNumber(productDTO.getSerialNumber())
                .manufacturer(productDTO.getManufacturer())
                .price(productDTO.getPrice())
                .count(productDTO.getCount())
                .build();

        product.setId(product.getId());

        return productRepository.save(product).getId();
    }

    public Product findById(Long id) {
        Optional<Product> product = productRepository.findById(id);
        return product.orElseThrow(RecordNotFoundException::new);
    }

    public List<Product> getByProductType(Long productType) {
        return productRepository.getByProductTypeId(productType);
    }

}
