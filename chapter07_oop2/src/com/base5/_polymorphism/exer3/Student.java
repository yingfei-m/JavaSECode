package com.base5._polymorphism.exer3;

/**
 * @Author myf15609
 * @Date 2025/1/15
 */
public class Student extends Person {
    protected String school = "pku";

    public String getInfo() {
        return "Name: " + name + "\nage: " + age
                + "\nschool: " + school;
    }
}
