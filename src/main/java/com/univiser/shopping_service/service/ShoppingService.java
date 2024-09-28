package com.univiser.shopping_service.service;

import com.univiser.shopping_service.dto.AvailableProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ShoppingService {
    @Autowired
    private WebClient webClient;

    public Flux<AvailableProductDTO> getInventoryDetails(){
        return webClient.get()
                .uri("http://localhost:8080/api/products/available")
                .retrieve()
                .bodyToFlux(AvailableProductDTO.class);
    }
}
