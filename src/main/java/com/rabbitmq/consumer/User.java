package com.rabbitmq.consumer;

import com.rabbitmq.dto.OrderStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class User {
    @RabbitListener(queues = "QUEUE2")
    public void consumeMessageFromQueue(OrderStatus orderStatus){
        System.out.println("Message received from queue :" + orderStatus);
    }
}
