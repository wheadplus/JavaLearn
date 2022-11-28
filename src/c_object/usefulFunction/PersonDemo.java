package src.c_object.usefulFunction;

import static java.lang.Object.*;

public class PersonDemo {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("张三");
        p.setAge(18);

        Person p2 = new Person();
        p2.setName("张三");
        p2.setAge(18);

        System.out.println(p.equals(p2));


        Object name = "张三";
        System.out.println(name instanceof Object);
        System.out.println(name instanceof String);
        System.out.println(name instanceof Person);
    }
}
