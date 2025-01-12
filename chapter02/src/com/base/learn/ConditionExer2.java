package com.base.learn;

/**
 * 获取三个数中的较大值
 *
 * @Author myf15609
 * @Date 2025/1/12
 */
public class ConditionExer2 {
    public static void main(String[] args) {
        int n1 = 23;
        int n2 = 13;
        int n3 = 33;
        // 写法1
        int tempMax = (n1 > n2) ? n1 : n2;
        int finalMax = (tempMax > n3) ? tempMax : n3;
        System.out.println("三个数种最大值为：" + finalMax);

        // 写法2
        int finalMax1 = (((n1 > n2) ? n1 : n2) > n3) ? ((n1 > n2) ? n1 : n2) : n3;
        System.out.println("三个数种最大值为：" + finalMax1);
    }
}
