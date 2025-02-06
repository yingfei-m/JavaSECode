package com.base10._enum;

/**
 * @Author myf15609
 * @Date 2025/2/6
 */
public class SeasonTest {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
    }
}

// JDK5.0 之前的定义方式
class Season {
    private final String SEASONNAME;//季节的名称
    private final String SEASONDESC;//季节的描述

    private Season(String seasonName, String seasonDesc) {
        this.SEASONNAME = seasonName;
        this.SEASONDESC = seasonDesc;
    }

    public static final Season SPRING = new Season("春天", "春暖花开");
    public static final Season SUMMER = new Season("夏天", "夏日炎炎");
    public static final Season AUTUMN = new Season("秋天", "秋高气爽");
    public static final Season WINTER = new Season("冬天", "白雪皑皑");

    @Override
    public String toString() {
        return "Season{" +
                "SEASONNAME='" + SEASONNAME + '\'' +
                ", SEASONDESC='" + SEASONDESC + '\'' +
                '}';
    }
}