package com.base10._enum.exer3;

/**
 * @Author myf15609
 * @Date 2025/2/6
 */
public class ColorTest {
    public static void main(String[] args) {
        System.out.println(Color.BLUE);
    }
}

enum Color {
    RED(255,0,0,"红色"),
    ORANGE(255,128,0,"橙色"),
    YELLOW(255,255,0,"黄色"),
    GREEN(0,255,0,"绿色"),
    CYAN(0,255,255,"青色"),
    BLUE(0,0,255,"蓝色"),
    PURPLE(128,0,255,"紫色");

    private final int red;
    private final int green;
    private final int blue;
    private final String description;//颜色的描述

    Color(int red, int green, int blue, String description) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.description = description;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Color{" +
                "red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                ", description='" + description + '\'' +
                '}';
    }
}