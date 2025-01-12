package com.base.learn;

/**
 * 定义两个整数，分别为 small 和 big，如果第一个整数small大于第二个整数big，就交换。输出显示small和big变量的值
 *
 * @Author myf15609
 * @Date 2025/1/12
 */
public class IfElseExer6 {
    public static void main(String[] args) {
        int small = 10;
        int big = 9;
        if (small > big) {
            int temp = small;
            small = big;
            big = temp;
        }
        System.out.println("small:" + small + ",big:" + big);
    }
}
