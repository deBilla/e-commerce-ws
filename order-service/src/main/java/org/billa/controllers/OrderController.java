package org.billa.controllers;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
public class OrderController {
    @GetMapping("/order")
    public String getOrder() {
        return "Hi Order";
    }
}
