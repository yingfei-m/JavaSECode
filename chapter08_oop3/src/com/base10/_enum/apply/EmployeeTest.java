package com.base10._enum.apply;

/**
 *
 * @Author myf15609
 * @Date 2025/2/6
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Tom", 21, Status.BUSY);
        System.out.println(e1);
    }
}
