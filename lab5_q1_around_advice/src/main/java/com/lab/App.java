package com.lab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
        BankService bank = ctx.getBean(BankService.class);
        bank.deposit(50000.0);
        ((ClassPathXmlApplicationContext) ctx).close();
    }
}
