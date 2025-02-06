package com.base9._inner.exer1;

/**
 * @Author myf15609
 * @Date 2025/2/6
 */
public class ObjectTest {
    public static void main(String[] args) {
        new Object() {
            public void test() {
                System.out.println("尚硅谷");
            }
        }.test();
    }
}
