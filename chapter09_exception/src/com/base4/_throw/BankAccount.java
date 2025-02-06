package com.base4._throw;

/**
 * 以下示例展示了如何创建一个自定义的非受检异常InsufficientFundsException，用于处理银行账户余额不足的情况
 * 如果希望创建一个非受检异常（不强制处理的异常），可以继承 RuntimeException 类
 *
 * @Author myf15609
 * @Date 2025/2/6
 */

// 自定义异常类，继承 RuntimeException
class InsufficientFundsException extends RuntimeException {
    // 默认构造方法
    public InsufficientFundsException() {
        super("账户余额不足");
    }

    // 接受自定义错误信息的构造方法
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // 提款方法，可能会抛出 InsufficientFundsException
    public void withdraw(double amount) {
        if (amount > balance) {
            throw new InsufficientFundsException("您的账户余额不足，无法提取: " + amount);
        }
        balance -= amount;
        System.out.println("成功提取: " + amount + "，当前余额: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        try {
            // 尝试提取超过余额的金额
            account.withdraw(1500.0);
        } catch (InsufficientFundsException e) {
            // 捕获并处理自定义异常
            System.out.println("捕获到异常: " + e.getMessage());
        }
    }
}
