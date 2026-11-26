package com.lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private Student student;

    public void display() {
        System.out.println("--- Student Details via Service ---");
        System.out.println(student.getInfo());
    }
}
