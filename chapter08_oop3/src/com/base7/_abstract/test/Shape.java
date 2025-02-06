package com.base7._abstract.test;

/**
 * 首先创建一个表示图形的抽象类 Shape
 *
 * @Author myf15609
 * @Date 2025/2/6
 */
public abstract class Shape {
    public int width;
    public int height;

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public abstract double area();
}
