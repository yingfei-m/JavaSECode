package com.base.learn;

import java.util.Scanner;

/**
 * <p> 随机产生3个1-6的整数，如果三个数相等，那么称为“豹子”
 * <p> 如果三个数之和大于9，称为“大”，如果三个数之和小于等于9，称为“小”，用户从键盘输入押的是“豹子”、“大”、“小”，并判断是否猜对了
 * <p> 如何获取[a,b]范围内的随机整数呢？(int)(Math.random() * (b - a + 1)) + a
 *
 * @Author myf15609
 * @Date 2025/1/12
 */
public class SwitchCaseExer4 {
    public static void main(String[] args) {
        // 1.随机产生3个1-6的整数
        int a = (int) (Math.random() * 6 + 1);
        int b = (int) (Math.random() * 6 + 1);
        int c = (int) (Math.random() * 6 + 1);

        // 2.压宝
        Scanner scanner = new Scanner(System.in);
        System.out.print("请押宝（豹子、大、小）：");
        String ya = scanner.next();
        scanner.close();

        // 3.判断结果
        boolean result = false;
        switch (ya) {
            case "豹子":
                result = a == b && b == c;
                break;
            case "大":
                result = a + b + c > 9;
                break;
            case "小":
                result = a + b + c <= 9;
                break;
        }
        System.out.println("a,b,c分别是：" + a + "," + b + "," + c);
        System.out.println(result ? "猜中了" : "猜错了");
    }
}
