package com.lab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        PaymentService ps = context.getBean(PaymentService.class);
        ps.checkout();
        ((ClassPathXmlApplicationContext) context).close();
    }
}
