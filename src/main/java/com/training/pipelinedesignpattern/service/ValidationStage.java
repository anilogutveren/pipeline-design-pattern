package com.training.pipelinedesignpattern.service;

import com.training.pipelinedesignpattern.dto.Order;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ValidationStage implements OrderProcessingStage{

    @Override
    public Order process(Order order) {
        if (order.getAmount() <= 0) {
            order.setOrderStatus("INVALID");
            log.warn("Order is invalid {}", order);
        } else {
            order.setOrderStatus("VALID");
            log.warn("Order is valid {}", order);
        }
        return order;
    }
}
