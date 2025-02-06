package com.base8._interface.exer1;

/**
 * @Author myf15609
 * @Date 2025/2/6
 */
public class EatableTest {
    public static void main(String[] args) {
        Eatable[] eatables = new Eatable[3];
        eatables[0] = new Chinese();
        eatables[1] = new American();
        eatables[2] = new Indian();

        for (Eatable e : eatables) {
            e.eat();
        }
    }
}
