package com.lab;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        StudentService service = context.getBean(StudentService.class);
        service.performTask();
        context.close();
    }
}
