package com.lab;

import org.springframework.stereotype.Component;

@Component("upiPayment")
public class UPIPayment implements Payment {
    @Override
    public void processPayment() {
        System.out.println("Mode: Instant UPI Payment verified via Virtual Payment Address (VPA).");
    }
}
