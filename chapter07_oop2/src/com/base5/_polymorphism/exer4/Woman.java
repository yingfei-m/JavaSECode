package com.base5._polymorphism.exer4;

/**
 * @Author myf15609
 * @Date 2025/1/15
 */
public class Woman extends Person {

    @Override
    public void eat() {
        System.out.println("吃饭");
    }

    @Override
    public void toilet() {
        System.out.println("洗手间");
    }

    public void makeup() {
        System.out.println("化妆");
    }
}
