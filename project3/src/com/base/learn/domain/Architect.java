package com.base.learn.domain;

/**
 * 架构师类
 *
 * @Author myf15609
 * @Date 2025/2/7
 */
public class Architect extends Designer{
    private int stock; // 股票数

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
