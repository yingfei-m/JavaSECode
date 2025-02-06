package com.base7._abstract.test;

/**
 * 定义一个正方形类，该类继承自形状类 Shape，并重写了 area( ) 抽象方法
 *
 * @Author myf15609
 * @Date 2025/2/6
 */
public class Square extends Shape {
    public Square(int width, int height) {
        super(width, height);
    }

    @Override
    public double area() {
        return width * height;
    }
}
