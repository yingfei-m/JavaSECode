package com.base.learn;

/**
 * 循环嵌套的例子
 *
 * @Author myf15609
 * @Date 2025/1/12
 */
public class ForForTest {
    public static void main(String[] args) {
        /*
         **********
         **********
         **********
         **********
         **********
         **********
         */
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------");

        // 乘法表
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }
            System.out.println();
        }
    }
}
