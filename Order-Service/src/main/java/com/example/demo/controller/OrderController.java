
package com.example.demo.controller;


import com.example.demo.model.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @PostMapping("/place")
    public ResponseEntity<String> placeOrder(@RequestBody Order order) {
        // Here you can connect to Market Service or DB later
        String response = "Order placed successfully for stock: " + order.getStockSymbol() +
                          ", Quantity: " + order.getQuantity();
        return ResponseEntity.ok(response);
    }
}
