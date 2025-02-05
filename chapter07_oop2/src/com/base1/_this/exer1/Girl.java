package com.base1._this.exer1;

/**
 * @Author myf15609
 * @Date 2025/1/15
 */
public class Girl {
    private String name;
    private int age;

    public Girl() {
    }

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void marry(Boy boy) {
        System.out.println("我想嫁给" + boy.getName());
        boy.marry(this);
    }

    /**
     * 比较两个 Girl 对象的大小
     * @param girl
     * @return 1：当前对象大，-1：当前对象小，0：相等
     */
    public int compare(Girl girl) {
        if (this.age > girl.age) {
            return 1;
        } else if (this.age < girl.age) {
            return -1;
        } else {
            return 0;
        }
    }
}
