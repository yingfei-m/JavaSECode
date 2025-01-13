package com.base4.example.exer4;

import java.util.Arrays;

/**
 * @Author myf15609
 * @Date 2025/1/13
 */
public class MyArraysTest {
    public static void main(String[] args) {

        // 1.动态初始化创建数组
        int[] arr = new int[20];

        // 2.通过循环给数组元素赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (99 - 10 + 1)) + 10; // [10 - 99]
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        MyArrays arrs = new MyArrays();

        System.out.println("最大值为：" + arrs.getMax(arr));
        System.out.println("最小值为：" + arrs.getMin(arr));
        System.out.println("和：" + arrs.getSum(arr));
        System.out.println("平均值为：" + arrs.getAvg(arr));
        // 遍历
        arrs.print(arr);
        System.out.println("新数组：" + Arrays.toString(arrs.copy(arr)));

        // 反转
        arrs.reverse(arr);

        // 反转后遍历数组
        arrs.print(arr);

        // 排序
        arrs.sort(arr);

        // 排序后遍历
        arrs.print(arr);

        System.out.println("查找：" + arrs.linearSearch(arr, 12));
    }
}
