package org.billa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
public class ProductController {
    @Autowired
    private DiscoveryClient discoveryClient;
    @GetMapping("/product")
    public String getOrder() {
        return "Hi Order";
    }
}
