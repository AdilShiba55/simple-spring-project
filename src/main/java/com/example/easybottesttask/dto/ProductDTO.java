package com.example.easybottesttask.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO implements Serializable {

    private Long id;
    @NotBlank
    private String name;
    @NotNull
    private Long productTypeId;
    private String serialNumber;
    private String manufacturer;
    @NotNull
    private Integer price;
    private Integer count;

}
