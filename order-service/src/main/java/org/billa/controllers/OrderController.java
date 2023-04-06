package org.billa.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @GetMapping("/order")
    public String getOrder() {
        return "Hi Order";
    }
}
