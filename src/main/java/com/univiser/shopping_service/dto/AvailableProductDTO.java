package com.univiser.shopping_service.dto;

import com.univiser.shopping_service.service.impl.AvailableProductService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AvailableProductDTO implements AvailableProductService {
    private String productName;
    private int quantity;
    private double price;
}
