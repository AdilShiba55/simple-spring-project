package com.example.easybottesttask.repository;

import com.example.easybottesttask.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(value = "select product from Product product order by product.id desc")
    List<Product> findAll();

    @Query(value = "select * from Product order by random() limit 1", nativeQuery = true)
    Optional<Product> getRandom();

    Optional<Product> findById(Long id);

    List<Product> getByProductTypeId(Long id);

}
