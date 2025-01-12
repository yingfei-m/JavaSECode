package com.base.learn;

/**
 * 为抵抗洪水，战士连续作战89小时，编程计算共多少天零多少小时？
 *
 * @Author myf15609
 * @Date 2025/1/12
 */
public class ArithmeticExer4 {
    public static void main(String[] args) {
        int hours = 89;
        int day = hours / 24;
        int hour = hours % 24;
        System.out.println("为抵抗洪水，战士们连续作战89个小时");
        System.out.println(hours + "小时，是" + day + "天" + hour + "小时");
    }
}
