package com.base2.two.exer4;

/**
 * 乘法口诀表
 *
 * @Author myf15609
 * @Date 2025/1/12
 */
public class VariableTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }
            System.out.println();
        }
    }
}
