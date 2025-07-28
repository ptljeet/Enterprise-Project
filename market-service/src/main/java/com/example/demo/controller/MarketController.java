package com.example.demo.controller;

import com.example.demo.model.MarketOrder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/market")
public class MarketController {

    @PostMapping("/execute")
    public ResponseEntity<String> executeOrder(@RequestBody MarketOrder order) {
        return ResponseEntity.ok("Market executed order: " + order.getStockSymbol() +
                                 " for quantity: " + order.getQuantity());
    }
}
