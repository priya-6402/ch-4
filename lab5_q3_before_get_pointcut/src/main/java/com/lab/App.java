package com.lab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
        AccountService acc = ctx.getBean(AccountService.class);
        acc.getAccountHolder();
        acc.getBalance();
        acc.modifyPin();
        ((ClassPathXmlApplicationContext) ctx).close();
    }
}
