package com.base.learn;

import java.util.Scanner;

/**
 * 使用switch-case实现：对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格
 *
 * @Author myf15609
 * @Date 2025/1/12
 */
public class SwitchCaseTest3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入成绩：");
        int score = scanner.nextInt();
        switch (score / 60) {
            case 0:
                System.out.println("不及格");
                break;
            case 1:
                System.out.println("及格");
                break;
            default:
                System.out.println("输入的成绩有误");
                break;
        }
    }
}
