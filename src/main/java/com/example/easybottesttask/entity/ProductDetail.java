package com.example.easybottesttask.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product_details")
public class ProductDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_detail_id_seq")
    @SequenceGenerator(name = "product_detail_id_seq", allocationSize = 1, initialValue = 1000)
    private Long id;

    @Column(name = "product_id")
    private Long productId;

    @ManyToOne
    @JoinColumn(name = "product_detail_type_id")
    private ProductDetailType productDetailType;

    @Column(name = "val")
    private String value;

}
