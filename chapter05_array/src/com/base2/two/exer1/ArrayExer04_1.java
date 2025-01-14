package com.base2.two.exer1;

/**
 * @Author myf15609
 * @Date 2025/1/12
 */
public class ArrayExer04_1 {
    public static void main(String[] args) {
        // 初始化数组：静态初始化
        int[][] arr = new int[][]{{3, 5, 8}, {12, 9}, {7, 0, 6, 4}};

        // 记录元素的总和
        int sum = 0;
        for (int[] its : arr) {
            for (int j : its) {
                sum += j;
            }
        }
        System.out.println("总和为：" + sum);
    }
}
