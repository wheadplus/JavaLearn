package src.c_object.usefulFunction;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    // 重写equals 判断两个对象是否相等
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Person person = (Person) o;
        if(person.age == this.age && person.name.equals(this.name)) {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
