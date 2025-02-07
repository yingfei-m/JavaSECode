package com.base.learn.domain;

/**
 * @Author myf15609
 * @Date 2025/2/7
 */
public class NoteBook implements Equipment {
    private String model; // 笔记本的型号
    private double price; // 笔记本的价格

    public NoteBook() {
    }

    public NoteBook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return model + "(" + price + ")";
    }
}
