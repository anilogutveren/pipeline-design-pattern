package com.training.pipelinedesignpattern.service;

import com.training.pipelinedesignpattern.dto.Order;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PaymentStage implements OrderProcessingStage {

        @Override
        public Order process(Order order) {
            if (order.getOrderStatus().equals("VALID")) {
                order.setOrderStatus("PAID");
                log.info("Payment processed {}", order);
            } else {
                order.setOrderStatus("FAILED");
                log.warn("Payment failed {}", order);
            }
            return order;
        }
}

