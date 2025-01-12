package com.base.learn;

/**
 * 遍历 1--100以内的偶数，并获取偶数的个数，获取所有偶数的和
 *
 * @Author myf15609
 * @Date 2025/1/12
 */
public class ForTest3 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                count++;
                sum += i;
            }
        }
        System.out.println("偶数的个数为：" + count);
        System.out.println("偶数的和为：" + sum);
    }
}
