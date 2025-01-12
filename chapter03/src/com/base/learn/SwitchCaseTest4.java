package com.base.learn;

import java.util.Scanner;

/**
 * <p> 在switch语句中，如果case的后面不写break，将出现穿透现象，也就是一旦匹配成功，不会在判断下一个case的值，直接向后运行，直到遇到break或者整个switch语句结束，执行终止。</br>
 * <p> 从键盘上输入2023年的“month”和“day”，要求通过程序输出输入的日期为2023年的第几天
 *
 * @Author myf15609
 * @Date 2025/1/12
 */
public class SwitchCaseTest4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("请输入2025年的month:");
        int month = scan.nextInt();

        System.out.print("请输入2025年的day:");
        int day = scan.nextInt();

        //这里就不针对 month 和 day 进行合法性的判断了，以后可以使用正则表达式进行校验
        int sumDays = 0;// 记录总天数

        //写法2：推荐
        switch(month){
            case 12:
                sumDays += 30; // 这个30是代表11月份的满月天数
            case 11:
                sumDays += 31; // 这个31是代表10月份的满月天数
            case 10:
                sumDays += 30; // 这个30是代表9月份的满月天数
            case 9:
                sumDays += 31; // 这个31是代表8月份的满月天数
            case 8:
                sumDays += 31; // 这个31是代表7月份的满月天数
            case 7:
                sumDays += 30; // 这个30是代表6月份的满月天数
            case 6:
                sumDays += 31; // 这个31是代表5月份的满月天数
            case 5:
                sumDays += 30; // 这个30是代表4月份的满月天数
            case 4:
                sumDays += 31; // 这个31是代表3月份的满月天数
            case 3:
                sumDays += 28; // 这个28是代表2月份的满月天数
            case 2:
                sumDays += 31; // 这个31是代表1月份的满月天数
            case 1:
                sumDays += day; // 这个day是代表当月的第几天
        }

        System.out.println(month + "月" + day + "日是2025年的第" + sumDays + "天");
        //关闭资源
        scan.close();
    }
}
