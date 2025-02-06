package com.base9._inner.exer5;

/**
 * @Author myf15609
 * @Date 2025/2/6
 */
public class outerTest1 {
    public static void main(String[] args) {
        sub_B b = new sub_B();
        b.method();
        System.out.println("-----------");

        // A 是一个抽象类，它不能实例化，但是 匿名内部类 允许我们在实例化时为该抽象类提供一个具体的实现类，虽然我们没有显示的定义一个类
        A a = new A() {
            @Override
            public void method() {
                System.out.println("继承于抽象类的子类调用的方法");
            }
        };
        a.method();
        System.out.println(a.getClass());
        System.out.println(a.getClass().getSuperclass());
        System.out.println("-----------");

        new A() {
            @Override
            public void method() {
                System.out.println("继承于抽象类的子类调用的方法123");
            }
        }.method();
        System.out.println("-----------");

        C c = new C();
        c.method();
        System.out.println(c.getClass()); // class com.base9._inner.exer5.C
        System.out.println(c.getClass().getSuperclass()); // class java.lang.Object
        System.out.println("-----------");

        C c1 = new C() {
            @Override
            public void method() {
                System.out.println("重写 C 中 method() 方法");
            }
        };
        c1.method();
        System.out.println(c1.getClass()); // class com.base9._inner.exer5.outerTest1$3
        System.out.println(c1.getClass().getSuperclass()); // class com.base9._inner.exer5.C

    }
}

abstract class A {
    public abstract void method();
}

class sub_B extends A {
    @Override
    public void method() {
        System.out.println("sub_B");
    }
}

class C {
    public void method() {
        System.out.println("C");
    }
}
