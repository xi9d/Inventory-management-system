package com.paul.IMS.Order;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface OrderService {
    List<Order> getAllOrders();
    Optional<Order> getOrderById(UUID id);
    Order saveOrder(Order order);
    void deleteOrder(UUID id);
}
