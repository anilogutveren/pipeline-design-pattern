package com.training.pipelinedesignpattern.service;

import com.training.pipelinedesignpattern.dto.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderProcessingPipeline {

    public List<OrderProcessingStage> stages = new ArrayList<>();

    public OrderProcessingPipeline addStages(OrderProcessingStage stage) {
        stages.add(stage);
        return this;
    }

    public Order execute(Order order) {
        for (OrderProcessingStage stage : stages) {
            order = stage.process(order);
            if (order.getOrderStatus().equals("INVALID") || order.getOrderStatus().equals("FAILED")) {
                break;
            }
        }
        return order;
    }
}
