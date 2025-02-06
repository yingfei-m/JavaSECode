package com.base7._abstract.template1;

/**
 * @Author myf15609
 * @Date 2025/2/6
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass abstractClass1 = new ConcreteClass1();
        AbstractClass abstractClass2 = new ConcreteClass2();

        abstractClass1.templateMethod();
        System.out.println("-----------------");
        abstractClass2.templateMethod();
    }
}
