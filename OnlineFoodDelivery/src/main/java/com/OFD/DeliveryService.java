package com.OFD;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class DeliveryService {

    @PostConstruct
    public void init() {
        System.out.println("Delivery Service Ready");
    }

    public void deliver() {
        System.out.println("Order Delivered");
    }

    @PreDestroy
    public void close() {
        System.out.println("Delivery Service Closed");
    }
}