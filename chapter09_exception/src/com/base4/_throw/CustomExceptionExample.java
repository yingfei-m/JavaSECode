package com.base4._throw;

/**
 * 以下示例展示了如何创建一个自定义的受检异常 InvalidAgeException，用于处理用户年龄不合法的情况
 * 如果希望创建一个受检异常（必须处理的异常），需要继承Exception类
 *
 * @Author myf15609
 * @Date 2025/2/6
 */

// 自定义异常类，继承 Exception
class InvalidAgeException extends Exception {
    // 默认构造方法
    public InvalidAgeException() {
        super("年龄不合法");
    }

    // 接受自定义错误信息的构造方法
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {

    // 检查年龄的方法，可能会抛出InvalidAgeException
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18 || age > 100) {
            throw new InvalidAgeException("年龄必须在18到100岁之间。");
        }
        System.out.println("年龄合法: " + age);
    }

    public static void main(String[] args) {
        try {
            // 调用方法并传入一个不合法的年龄
            checkAge(15);
        } catch (InvalidAgeException e) {
            // 捕获并处理自定义异常
            System.out.println("捕获到异常: " + e.getMessage());
        }
    }
}


