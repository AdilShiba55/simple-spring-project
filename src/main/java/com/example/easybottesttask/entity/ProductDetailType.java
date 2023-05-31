package com.example.easybottesttask.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product_detail_types")
public class ProductDetailType extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "name_short")
    private String shortName;

}
