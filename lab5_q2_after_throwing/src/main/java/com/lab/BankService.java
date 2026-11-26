package com.lab;

import org.springframework.stereotype.Service;

@Service
public class BankService {
    private double balance = 10000.0;

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Requested Rs. " + amount + " exceeds balance Rs. " + balance);
        }
        balance -= amount;
        System.out.println("Remaining Balance: Rs. " + balance);
    }
}
