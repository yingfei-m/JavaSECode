package com.base.learn;

/**
 * 1. 定义类 CompareLogicExer
 * 2. 定义 main 方法
 * 3. 定义一个int类型变量a,变量b,都赋值为20
 * 4. 定义boolean类型变量bo1 , 判断++a 是否被3整除,并且a++ 是否被7整除,将结果赋值给bo1
 * 5. 输出a的值,bo1的值
 * 6. 定义boolean类型变量bo2 , 判断b++ 是否被3整除,并且++b 是否被7整除,将结果赋值给bo2
 * 7. 输出b的值,bo2的值
 *
 * @Author myf15609
 * @Date 2025/1/12
 */
public class CompareLogicExer {
    public static void main(String[] args) {
        int a = 20;
        int b = 20;
        boolean bo1 = ((++a % 3) == 0) && ((a++ % 7) == 0);
        System.out.println("bo1的值：" + bo1); // true
        System.out.println("a的值：" + a); // 22
        System.out.println("----------------------------");

        boolean bo2 = ((b++ % 3) == 0) && ((++b % 7) == 0); // 左边为假，右边不参与运算
        System.out.println("bo2的值：" + bo2); // false
        System.out.println("b的值：" + b); // 21

    }
}
