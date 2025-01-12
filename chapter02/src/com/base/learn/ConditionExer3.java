package com.base.learn;

/**
 * 控制台输出"今天是周2，10天以后是周x
 *
 * @Author myf15609
 * @Date 2025/1/12
 */
public class ConditionExer3 {
    public static void main(String[] args) {
        int week = 2;
        week += 10;
        week %= 7;
        System.out.println("今天是周2，10天以后是周" + (week == 0 ? "日" : week));

    }
}
