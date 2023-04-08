package org.billa.components;

import org.billa.entities.Order;

public record OrderDetails (Order order, String productName){}
