package com.base.learn;

/**
 * 要求填写自己的姓名、年龄、性别、体重、婚姻状况（已婚用true表示，单身用false表示）、联系方式等等。
 *
 * @Author myf15609
 * @Date 2025/1/11
 */
public class Info {
    public static void main(String[] args) {
        String name = "yingfei.mao";
        int age = 18;
        char gender = '男';
        double weight = 140;
        boolean isMarried = true;
        String phoneNumber = "177****0143";

        System.out.println("name = " + name + ",age = " + age + ",gender = " + gender + ",weight = " +
                weight + ",isMarried = " + isMarried + ",phoneNumber = " + phoneNumber);
    }
}
