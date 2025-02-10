package com.base1._create.thread;

import org.junit.Test;

/**
 * @Author myf15609
 * @Date 2025/2/9
 */
public class EvenNumberTest01 {
    @Test
    public void test01() {
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }.start();
    }
}
