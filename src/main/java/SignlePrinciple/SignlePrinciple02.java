package SignlePrinciple;

/**
 * 这里将单一职责原则
 * 什么是单一职责原则呢? 单一职责原则指的是一个类只做一件事. 如果一个类A做了2件事: A1和A2
 * 那么当A1发生变化改动代码的时候, 很可能会影响A2, 所以, 我们应该将A1和A2差分开为两个类
 */
public class SignlePrinciple02 {
    public static void main(String[] args) {
        VehicleRoad vehicle = new VehicleRoad();
        vehicle.run("摩托车");

        VehicleWater vehicleWater = new VehicleWater();
        vehicleWater.run("轮船");

        VehicleAir vehicleAir = new VehicleAir();
        vehicleAir.run("飞机");
    }
}

class VehicleRoad {
    /**
     * 车...跑...
     */
    public void run(String vehicle) {
        System.out.println(vehicle + "正在马路上跑.....");
    }
}


class VehicleWater {
    /**
     * 车...跑...
     */
    public void run(String vehicle) {
        System.out.println(vehicle + "正在水上运行.....");
    }
}

class VehicleAir {
    /**
     * 车...跑...
     */
    public void run(String vehicle) {
        System.out.println(vehicle + "正在天上飞.....");
    }
}