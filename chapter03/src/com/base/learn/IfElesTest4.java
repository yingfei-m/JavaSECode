package com.base.learn;

/**
 * 三个数大小比较
 *
 * @Author myf15609
 * @Date 2025/1/12
 */
public class IfElesTest4 {
    public static void main(String[] args) {
        // 声明 num1,num2,num3 三个变量并赋值
        int num1 = 22, num2 = 32, num3 = 12;

        if (num1 >= num2) {
            if (num2 >= num3)
                System.out.println(num3 + "-" + num2 + "-" + num3);
            else if (num3 >= num1)
                System.out.println(num2 + "-" + num1 + "-" + num3);
            else
                System.out.println(num2 + "-" + num3 + "-" + num1);
        } else { // num1 < num2
            if (num2 <= num3)
                System.out.println(num1 + "-" + num2 + "-" + num3);
            else if (num3 <= num1)
                System.out.println(num3 + "-" + num1 + "-" + num2);
            else
                System.out.println(num1 + "-" + num3 + "-" + num2);
        }
    }
}
