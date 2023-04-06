package org.billa.components;

import java.util.List;

public record Cart (String orderId, List<String> items){}
