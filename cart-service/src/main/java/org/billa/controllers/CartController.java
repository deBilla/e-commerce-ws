package org.billa.controllers;

import org.billa.components.Cart;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CartController {
    @GetMapping("/cart")
    public Cart getCart() {
        return new Cart("11", new ArrayList<>());
    }
}
