package com.example.easybottesttask.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product_types")
public class ProductType {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_type_id_seq")
    @SequenceGenerator(name = "product_type_id_seq", allocationSize = 1, initialValue = 1000)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "name_short")
    private String shortName;

}
