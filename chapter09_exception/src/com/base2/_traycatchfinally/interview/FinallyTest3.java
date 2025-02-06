package com.base2._traycatchfinally.interview;

/**
 * 如果在finally块中也有return语句，那么finally块中的return将会覆盖try或catch块中的return语句，最终返回finally块中的值。
 *
 * @Author myf15609
 * @Date 2025/2/6
 */
public class FinallyTest3 {
    public static void main(String[] args) {
        int result = test("a");
        System.out.println(result);
    }

    public static int test(String str) {
        try {
            Integer.parseInt(str);
            return 1;
        } catch (NumberFormatException e) {
            return -1;
        } finally {
            System.out.println("test结束");
            return 0;
        }
    }
}

/*
test结束
0
*/