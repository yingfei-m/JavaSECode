package com.base3.field_method.mothdo.exer;

/**
 * @Author myf15609
 * @Date 2025/1/13
 */
public class Employee {
    int id;
    String name;
    int age;
    double salary;

    public void show1() {
        System.out.println("id = " + id + ",name = " + name + ",age = " + age + ",salary = " + salary);
    }

    public String show2() {
        return "id = " + id + ",name = " + name + ",age = " + age + ",salary = " + salary;
    }
}
