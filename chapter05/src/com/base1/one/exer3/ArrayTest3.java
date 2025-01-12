package com.base1.one.exer3;

import java.util.Scanner;

/**
 * 从键盘读入学生的成绩，找出最高分，并输出学生成绩等级
 *
 * @Author myf15609
 * @Date 2025/1/12
 */
public class ArrayTest3 {
    public static void main(String[] args) {
        // 1.根据提示，获取学生个数
        System.out.print("请输入学生个数：");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        // 2.根据学生个数，创建指定长度的数组
        int[] scores = new int[count];

        // 3.使用循环，以此给数组元素赋值
        // 记录最高分
        int maxScore = 0;
        System.out.println("请输入" + count + "个成绩");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
            // 4.获取数组中元素的最大值，即为最高分
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }
        System.out.println("最高分是：" + maxScore);

        // 5.遍历数组元素，输出各自的分数，并根据其分数与最高分的差值，获取各自的等级
        char grade;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > maxScore - 10) {
                grade = 'A';
            } else if (scores[i] > maxScore - 20) {
                grade = 'B';
            } else if (scores[i] > maxScore - 30) {
                grade = 'C';
            } else {
                grade = 'D';
            }
            System.out.println("Student " + i + " score is " + scores[i] + ", grade is " + grade);
        }
        scanner.close();
    }
}
