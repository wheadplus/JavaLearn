package src.c_object.base;

class Animal {
    public void eat () {
        System.out.println("动物吃饭");
    }
}

class Cat extends Animal {
    public void eat () {
        System.out.println("猫吃鱼");
    }
    public void eatTest () {
        // 调用本类的方法
        this.eat();
        // 调用父类的方法
        super.eat();
    }
}

public class SuperDemo {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eatTest();
    }
}
