package com.rabbitmq.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public @Data class Order {

    private String OrderId;

    private String name;

    private int qty;

    private  double price;
}