package com.lab;

import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
public class StudentService {

    @PostConstruct
    public void init() {
        System.out.println("[Lifecycle] Service Started: Database connection pool allocated.");
    }

    public void performTask() {
        System.out.println("[Business Logic] Processing student enrollment records...");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("[Lifecycle] Service Closed: Database connections closed successfully.");
    }
}
