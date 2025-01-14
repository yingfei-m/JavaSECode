package com.base3.common_algorithm.exer5;

/**
 * @Author myf15609
 * @Date 2025/1/12
 */
public class ArrayTest5_1 {
    public static void main(String[] args) {
        int[] arr = {34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }
}
