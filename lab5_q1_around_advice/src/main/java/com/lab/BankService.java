package com.lab;

import org.springframework.stereotype.Service;

@Service
public class BankService {
    public void deposit(double amount) {
        try { Thread.sleep(65); } catch (InterruptedException ignored) {}
        System.out.println("Deposited amount: Rs. " + amount);
    }
}
