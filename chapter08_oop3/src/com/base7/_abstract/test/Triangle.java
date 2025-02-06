package com.base7._abstract.test;

/**
 * 定义一个三角形类，该类与正方形类一样，需要继承形状类 Shape，并重写父类中的抽象方法 area()。
 *
 * @Author myf15609
 * @Date 2025/2/6
 */
public class Triangle extends Shape {
    public Triangle(int width, int height) {
        super(width, height);
    }

    @Override
    public double area() {
        return 0.5 * width * height;
    }
}
