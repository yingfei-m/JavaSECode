package com.base7._abstract.test;

/**
 * @Author myf15609
 * @Date 2025/2/6
 */
public class AbstractTest {
    public static void main(String[] args) {
        Square square = new Square(5, 4);
        System.out.println("正方形面积为：" + square.area());

        Triangle triangle = new Triangle(2, 5);
        System.out.println("三角形面积为：" + triangle.area());
    }
}
