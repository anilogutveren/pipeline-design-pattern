package com.training.pipelinedesignpattern;

import com.training.pipelinedesignpattern.dto.Order;
import com.training.pipelinedesignpattern.service.OrderProcessingPipeline;
import com.training.pipelinedesignpattern.service.PaymentStage;
import com.training.pipelinedesignpattern.service.ShippingStage;
import com.training.pipelinedesignpattern.service.ValidationStage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PipelineDesignPatternApplication {

    public static void main(String[] args) {

        SpringApplication.run(PipelineDesignPatternApplication.class, args);

        Order order = new Order("ORD123", 100);

        OrderProcessingPipeline pipeline = new OrderProcessingPipeline()
                .addStages(new ValidationStage())
                .addStages(new PaymentStage())
                .addStages(new ShippingStage());

        pipeline.execute(order);

    }
}
