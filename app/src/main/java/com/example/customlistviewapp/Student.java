package com.example.customlistviewapp;

public class Student {
    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public Student(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }

    private String name, dob;
}
