package src.c_object.base;

// 智能手机
public class NewPhone extends Phone {
    // 方法重写：调用父类的方法+自己自定义的内容
    public void showNum () {
        super.showNum();
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
