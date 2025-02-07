package com.base.learn.domain;

/**
 * 架构师类
 *
 * @Author myf15609
 * @Date 2023/9/11
 */
public class Designer extends Programmer{
    private double bonus; // 奖金

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
