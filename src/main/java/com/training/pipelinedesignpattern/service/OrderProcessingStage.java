package com.training.pipelinedesignpattern.service;

import com.training.pipelinedesignpattern.dto.Order;

public interface OrderProcessingStage {

    public Order process(Order order);
}
