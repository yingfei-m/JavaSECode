package com.base8._interface.exer3;

/**
 * @Author myf15609
 * @Date 2025/2/6
 */
public class VehicleTest {
    public static void main(String[] args) {
        Developer developer = new Developer();

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Bicycle("捷安特", "red");
        vehicles[1] = new ElectricVehicle("雅迪", "yellow");
        vehicles[2] = new Car("奔驰", "黑色", "沪A99999");

        for (Vehicle v : vehicles) {
            developer.takingVehicle(v);
            // 判断 v 是否是 IPower 的实现类
            if (v instanceof IPower) {
                ((IPower) v).power();
            }
        }
    }
}
