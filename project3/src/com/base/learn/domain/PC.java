package com.base.learn.domain;

/**
 * @Author myf15609
 * @Date 2025/2/7
 */
public class PC implements Equipment {
    private String model; // 显示器型号
    private String display; // 显示器的名称

    public PC() {
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String getDescription() {
        return model + "(" + display + ")";
    }
}
