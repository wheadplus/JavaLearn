package src.c_object.interfaceDemo;

public class FlyTest {
    public static void main(String[] args) {
        BirdFly birdFly = new BirdFly();
        birdFly.fly();

        // 匿名内部类 = 抽象类 + 子类对象
        new FlyAble() {
            @Override
            public void fly() {
                System.out.println("鸟飞：匿名内部类");
            }
        }.fly();

        FlyAble flyAble = new FlyAble() {
            @Override
            public void fly() {
                System.out.println("鸟飞：匿名内部类");
            }
        };
        flyAble.fly();
    }
}
