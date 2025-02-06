package com.base5._polymorphism.exer5;

/**
 * 动态绑定的基本实例
 *
 * @Author myf15609
 * @Date 2025/2/6
 */

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Test1 {
    public static void main(String[] args) {
        Animal a = new Dog();  // Animal 类型的引用指向 Dog 对象
        a.sound(); // 动态绑定，实际调用 Dog 的 sound 方法
    }
}

/*
变量 a 是 Animal 类型，但它指向的是 Dog 类的对象。
当我们调用 a.sound() 时，虽然 a 的声明类型是 Animal，但是因为 a 实际指向的是 Dog 类型的对象，
Java 会动态地绑定到 Dog 类中的 sound() 方法，而不是 Animal 类中的 sound() 方法。因此，输出的是 "Dog barks"。
 */