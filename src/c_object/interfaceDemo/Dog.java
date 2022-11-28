package src.c_object.interfaceDemo;

/*
    interface Animal接口列出功能，Dog类实现功能
* */
public class Dog implements Animal {
    @Override
    public void run() {
        System.out.println("狗跑");
    }

    @Override
    public void eat() {
        System.out.println("狗吃");
    }
}
