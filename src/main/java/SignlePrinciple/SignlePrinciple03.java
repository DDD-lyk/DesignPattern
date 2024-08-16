package SignlePrinciple;

/**
 * 这里将单一职责原则
 * 什么是单一职责原则呢? 单一职责原则指的是一个类只做一件事. 如果一个类A做了2件事: A1和A2
 * 那么当A1发生变化改动代码的时候, 很可能会影响A2, 所以, 我们应该将A1和A2差分开为两个类
 */
public class SignlePrinciple03 {
    public static void main(String[] args) {
        Vehicle2 vehicle = new Vehicle2();
        vehicle.runRoad("摩托车");
        vehicle.runWater("轮船");
        vehicle.runAir("飞机");
    }
}

class Vehicle2 {

    public void runRoad(String vehicle) {
        System.out.println(vehicle + "正在马路上跑.....");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + "正在水上运行.....");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + "正在天上飞.....");
    }
}