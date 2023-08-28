package com.paul.IMS.Order;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {
    private UUID id;
    private UUID customerId;
    private UUID productId;
    private int quantity;
    private String orderNumber;
    @Builder.Default
    private LocalDate orderDate = LocalDate.now();
    private double totalAmount;
    private OrderStatus status;
    

}
