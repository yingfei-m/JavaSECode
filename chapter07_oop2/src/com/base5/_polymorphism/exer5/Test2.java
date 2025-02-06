package com.base5._polymorphism.exer5;

/**
 * 动态绑定与构造函数中的方法调用
 *
 * @Author myf15609
 * @Date 2025/2/6
 */
class Animal2 {
    Animal2() {
        makeSound();  // 在构造方法中调用方法
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog2 extends Animal2 {
    public Dog2() {
        System.out.println("Dog created");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Animal2 animal2 = new Dog2();  // 创建 Dog 对象
    }
}

// Dog barks
// Dog created

/*
在 Dog 类的构造方法中，首先调用 super() 来调用父类 Animal 的构造方法。
在父类 Animal 的构造方法中，调用了 makeSound() 方法。由于方法是动态绑定的，因此虽然调用发生在父类的构造方法中，实际执行的是 Dog 类中的 makeSound() 方法，而不是 Animal 类中的 makeSound() 方法。因此，输出 "Dog barks"。
然后执行 Dog 类构造方法中的 System.out.println("Dog created")，输出 "Dog created"。
 */