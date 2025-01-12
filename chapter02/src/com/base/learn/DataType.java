package com.base.learn;

/**
 * 基本数据类型变量间的运算规则
 *
 * @Author myf15609
 * @Date 2025/1/11
 */
public class DataType {
    public static void main(String[] args) {

        // 当把存储范围小的值，赋值给存储范围大的变量时
        int i = 'A'; // char自动升级为int，其实就是把字符串的编码赋值给 i 变量了
        System.out.println(i); //65

        double d = 10; // int 自动升级为 double
        System.out.println(d); // 10.0

        long num = 1234567; // 右边的整数常量值如果在 int 范围内，编译和运行都可以通过，这里涉及到数据类型的转换
        System.out.println(num);

        // byte bigA = 130; // 错误，右边的整数常量值超过 byte 范围
        long bigNum = 12345678912L; // 右边的整数常量值如果超过int范围，必须加L，显式表示long类型。否则编译不通过

        // 当存储范围小的数据类型与存储范围大的数据类型变量一起混合运算时，会按照其中大的类型运算
        int a = 1;
        int b = 2;
        double c = 1.0;
        double sum = a + c + b;
        System.out.println(sum); // 4.0 混合运算，升级为 double

        // 当 byte、short、char 数据类型的变量进行算术运算时，按照 int 类型处理
        byte b1 = 1;
        byte b2 = 2;
        // byte b3 = b1 + b2; // 编译报错，b1 + b2 自动升级为 int


        char c1 = '0'; // '0' 的 Unicode 编码值是 48
        char c2 = 'A'; // 'A' 的 Unicode 编码值是 65
        int c3 = c1 + c2;
        System.out.println(c3); // 113 至少需要使用 int 类型来接收

        // 当把范围大的值，强制转换为存储范围小的变量时，可能会损失精度或溢出
        int e = (int) 3.14; // 损失精度

        double d1 = 1.2;
        int d2 = (int) d1; // 损失精度

        int i2 = 200;
        byte b3 = (byte) i2;
        System.out.println(b3); // -56， 溢出
        /*
            如果将超过这个范围的值赋给 byte 类型，Java 会按照二进制补码表示法进行截断，只保留低 8 位
            int 是 32 位的有符号整数，200 的二进制表示为：00000000 00000000 00000000 11001000
            当将 int 转换为 byte 时，只保留低 8 位：11001000
            11001000 是一个 8 位的二进制数，它在 byte 中使用 补码 表示法
            如果最高位（符号位）是 1，表示这个数是负数。
            要计算补码对应的十进制值，可以先将其转换为原码：
            取反：00110111
            加 1：00111000（十进制是 56）
            加上符号：-56
         */

        // 当某个值想要提升数据类型时，也可也是用使用强制类型转换，这种强制类型转换是没有风险，通常省略
        // 生命 long 类型变量时，可以出现省略后缀的情况 float 不同

        long l1 = 123L;
        long l2 = 123; // 此时可以看做是 int 类型的123 自动类型提升为 long 类型

        // long l3 = 121212121212; // 报错，因为 121212121212 超出了 int 的范围
        long l4 = 121212121212L;

        // float f1 = 1.2; // 报错，因为 1.2 看做是 double 类型，不能自动转换为 float 类型
        float f1 = 1.2F;
        float f2 = (float) 1.2;

        // 任意八种基本数据类型的数据与 String 类型只能进行连接 "+" 运算，且结果一定也是 String 类型
        System.out.println("" + 1 + 2); // 12

        int num2 = 10;
        boolean b4 = true;
        String s1 = "abc";

        String s2 = s1 + num2 + b4;
        System.out.println(s2); // abc10true

        // String s3 = num2 + b4 + s1; // 编译不通过，因为 int 类型不能与 boolean 运算
        String s4 = num2 + (b4 + s1); // 编译通过

        // String类型不能通过强制类型()转换，转为其他的类型
        String str = "123";
        // int num = (int)str;//错误的

        int num3 = Integer.parseInt(str);// 正确的，后面才能讲到，借助包装类的方法才能转
    }
}
