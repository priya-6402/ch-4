package com.lab;

import org.springframework.stereotype.Service;

@Service
public class AccountService {
    public String getAccountHolder() { return "Rohan Deshmukh"; }
    public double getBalance() { return 84000.0; }
    public void modifyPin() { System.out.println("PIN updated."); }
}
