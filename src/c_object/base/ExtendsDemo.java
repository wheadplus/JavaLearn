package src.c_object.base;

class Father {
    public String home = "广东";
    public void show () {
        System.out.println("Father showing");
    }
}

class Son extends Father {
    public void run () {
        System.out.println("Son running");
    }
    public void show () { System.out.println("son showing");}
}

class City {
    public void showAddress() {
        System.out.println("广东");
    }
}

class Home extends City {
    public void showAddress () {
        // 调用父类已经存在的功能使用super
        super.showAddress();
        // 增加自己特有的功能
        System.out.println("广州");

    }
}

public class ExtendsDemo {
    public static void main(String[] args) {
        Father fa = new Father();
        fa.show();
        Son son = new Son();
        System.out.println(son.home);
        son.show();

        Home home = new Home();
        home.showAddress();
    }
}
