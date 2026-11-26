package com.lab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        StudentService service = context.getBean(StudentService.class);
        service.display();
        ((ClassPathXmlApplicationContext) context).close();
    }
}
