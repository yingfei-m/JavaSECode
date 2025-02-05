package com.base1._this.exer1;

/**
 * @Author myf15609
 * @Date 2025/1/15
 */
public class BoyGirlTest {
    public static void main(String[] args) {
        Boy b1 = new Boy("杰克", 24);
        Girl g1 = new Girl("朱丽叶", 20);

        g1.marry(b1);
        b1.shout();

        Girl g2 = new Girl("肉丝", 18);
        System.out.println(g2.compare(g1));
    }
}
