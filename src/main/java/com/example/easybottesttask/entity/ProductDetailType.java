package com.example.easybottesttask.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product_detail_types")
public class ProductDetailType {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_detail_type_id")
    @SequenceGenerator(name = "product_detail_type_id", allocationSize = 1, initialValue = 1000)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "name_short")
    private String shortName;

}
