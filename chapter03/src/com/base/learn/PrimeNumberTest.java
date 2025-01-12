package com.base.learn;

/**
 * <p> 1000以内的所有质数的输出
 * <p> 质数：只能被1和它本身整除的自然数 --> 从2开始到这个自然数-1为止，不存在此自然数的约数
 *
 * @Author myf15609
 * @Date 2025/1/12
 */
public class PrimeNumberTest {
    public static void main(String[] args) {
        boolean isFlag = true;
        for (int i = 2; i <= 1000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isFlag = false;
                    break;
                }
            }
            if (isFlag) {
                System.out.println(i);
            }
            isFlag = true;
        }
    }
}
