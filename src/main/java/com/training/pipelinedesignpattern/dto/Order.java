package com.training.pipelinedesignpattern.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    String orderId;
    double amount;
    String orderStatus;


    public Order(String orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
        this.orderStatus = "NEW";
    }

    @Override
    public String toString() {
        return String.format ("Order ID: %s, Amount: %.2f, Order Status: %s", orderId, amount, orderStatus);
    }
}
