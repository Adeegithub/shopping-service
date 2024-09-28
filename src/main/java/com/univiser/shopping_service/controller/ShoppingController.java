package com.univiser.shopping_service.controller;

import com.univiser.shopping_service.dto.AvailableProductDTO;
import com.univiser.shopping_service.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RequestMapping("/api/shopping")
@RestController
public class ShoppingController {
    @Autowired
    private ShoppingService shoppingService;
    @GetMapping("/available")
    public Flux<AvailableProductDTO> getAvailableProducts() {
        return shoppingService.getInventoryDetails();
    }
}
