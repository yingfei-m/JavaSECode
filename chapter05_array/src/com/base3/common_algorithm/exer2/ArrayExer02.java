package com.base3.common_algorithm.exer2;

/**
 * @Author myf15609
 * @Date 2025/1/12
 */
public class ArrayExer02 {
    public static void main(String[] args) {
        int[] scores = {5, 4, 6, 9, 0, 3, 7, 10, 8, 9};
        int sum = 0;
        int max = scores[0];
        int min = scores[0];
        for (int score : scores) {
            if (score > max) {
                max = score;
            }
            if (score < min) {
                min = score;
            }
            sum += score;
        }
        int average = sum / (scores.length - 2);
        System.out.println("平均值: " + average);
    }
}
