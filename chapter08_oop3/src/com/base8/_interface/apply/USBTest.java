package com.base8._interface.apply;

/**
 * 通过这个例子，留意四种不同的写法，体现出接口使用的多态性
 *
 * @Author myf15609
 * @Date 2025/2/6
 */
public class USBTest {
    public static void main(String[] args) {
        Computer computer = new Computer();

        //1.创建接口实现类的对象
        Printer printer = new Printer();
        computer.transferData(printer);
        System.out.println("--------------");

        //2.创建接口实现类的匿名对象
        computer.transferData(new Camera());
        System.out.println("--------------");

        //3.创建接口匿名实现类的对象
        USB usb1 = new USB() {
            public void start() {
                System.out.println("U盘开始工作");
            }

            public void stop() {
                System.out.println("U盘结束工作");
            }
        };
        computer.transferData(usb1);
        System.out.println("--------------");

        //4. 创建接口匿名实现类的匿名对象
        computer.transferData(new USB() {
            public void start() {
                System.out.println("扫描仪开始工作");
            }

            public void stop() {
                System.out.println("扫描仪结束工作");
            }
        });
    }
}

class Computer {
    public void transferData(USB usb) { // 多态：USB usb = new Printer();
        System.out.println("设备连接成功....");
        usb.start();
        System.out.println("数据传输的细节操作....");
        usb.stop();
    }
}

class Camera implements USB {

    @Override
    public void start() {
        System.out.println("照相机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("照相机结束工作");
    }
}

class Printer implements USB {

    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}

interface USB {
    //声明常量
    //USB的长、宽、高、...

    //方法
    public abstract void start();
    void stop();
}
