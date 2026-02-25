package com.OFD;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainFoodApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(FoodApp.class);

        OrderService order = ctx.getBean(OrderService.class);
        order.placeOrder();

        ctx.close();
    }
}