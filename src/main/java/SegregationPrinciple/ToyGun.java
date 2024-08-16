package SegregationPrinciple;

public class ToyGun implements IGun {
    @Override
    public void trigger() {
        System.out.println("扣动扳机");
    }

    @Override
    public void bullet() {
        System.out.println("放子弹");
    }

    @Override
    public void shot() {
        // 空实现, 什么也不做
    }
}