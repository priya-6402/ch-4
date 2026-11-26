package com.lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    @Qualifier("upiPayment")
    private Payment payment;

    public void checkout() {
        payment.processPayment();
    }
}
