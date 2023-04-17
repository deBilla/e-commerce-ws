package org.billa.controllers;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import org.billa.entities.Cart;
import org.billa.repositories.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@DgsComponent
public class CartDataFetcher {
    private final CartRepository cartRepository;

    @Autowired
    public CartDataFetcher(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @DgsQuery
    public List<Cart> carts(@InputArgument Long idFilter) {
        if (idFilter == null) {
            return cartRepository.findAll();
        }

        return cartRepository.findAll().stream().filter(s -> (Objects.equals(s.getId(), idFilter))).collect(Collectors.toList());
    }
}