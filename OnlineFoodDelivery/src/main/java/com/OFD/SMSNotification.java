package com.OFD;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("smsNotification")
@Lazy
public class SMSNotification implements NotificationService {
    @Override
    public void sendNotification(String msg) {
        System.out.println("SMS: " + msg);
    }
}