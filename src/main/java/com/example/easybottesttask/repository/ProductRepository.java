package com.example.easybottesttask.repository;

import com.example.easybottesttask.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Optional<Product> findById(Long id);
    List<Product> getByProductTypeId(Long id);

}
