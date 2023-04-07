package org.billa.services;

import org.billa.entities.Order;
import org.billa.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public Order updateOrder(Long id, Order order) {
        Order existingOrder = getOrderById(id);
        if (existingOrder == null) {
            return null;
        }
        existingOrder.setName(order.getName());
        existingOrder.setDescription(order.getDescription());
        existingOrder.setPrice(order.getPrice());
        return orderRepository.save(existingOrder);
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
