package com.training.pipelinedesignpattern.service;

import com.training.pipelinedesignpattern.dto.Order;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ShippingStage implements OrderProcessingStage{

    @Override
    public Order process(Order order) {

        if (order.getOrderStatus().equals("PAID")) {
            order.setOrderStatus("SHIPPED");
            log.info("Order shipped {}", order);
        } else {
            order.setOrderStatus("FAILED");
            log.warn("Shipping failed {}", order);
        }
        return order;
    }
}
