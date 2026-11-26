package com.lab;

import org.springframework.stereotype.Component;

@Component("cashPayment")
public class CashPayment implements Payment {
    @Override
    public void processPayment() {
        System.out.println("Mode: Cash on Delivery payment acknowledged.");
    }
}
