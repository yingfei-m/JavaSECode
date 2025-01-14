package com.base5.method_more._03valuetransfer.exer1;

/**
 * @Author myf15609
 * @Date 2025/1/14
 */
public class PassObject {
    public static void main(String[] args) {
        PassObject p = new PassObject();
        Circle c = new Circle();

        p.printAreas(c, 5);
        System.out.println();
        System.out.println("now radius is: " + c.radius);
    }

    public void printAreas(Circle c, int time) {
        System.out.println("Radius\t\tArea");
        int i = 1;
        for (; i < time + 1; i++) {
            c.radius = i;
            System.out.println(c.radius + "\t\t\t" + c.findArea());
        }
    }
}
