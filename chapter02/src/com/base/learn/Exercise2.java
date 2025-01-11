package com.base.learn;

/**
 * 温度转换 ℃ = (℉ - 32) / 1.8
 *
 * @Author myf15609
 * @Date 2025/1/11
 */
public class Exercise2 {
    public static void main(String[] args) {
        double hua = 80;
        double she = (hua - 32) / 1.8;
        System.out.println("华氏度 " + hua + " ℉ 转为摄氏度是 " + she + " ℃");
    }
}
// 华氏度 80.0 ℉ 转为摄氏度是 26.666666666666664 ℃
