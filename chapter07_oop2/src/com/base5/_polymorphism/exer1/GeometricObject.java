package com.base5._polymorphism.exer1;

/**
 * @Author myf15609
 * @Date 2025/1/15
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double findArea() {
        return 0.0;
    }
}
