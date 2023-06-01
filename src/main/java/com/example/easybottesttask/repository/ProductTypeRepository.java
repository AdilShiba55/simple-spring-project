package com.example.easybottesttask.repository;

import com.example.easybottesttask.entity.Product;
import com.example.easybottesttask.entity.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ProductTypeRepository extends JpaRepository<ProductType, Long> {

    @Query(value = "select * from ProductType order by random() limit 1", nativeQuery = true)
    Optional<ProductType> getRandom();

}
