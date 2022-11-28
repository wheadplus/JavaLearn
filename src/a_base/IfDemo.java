package src.a_base;

public class IfDemo {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        if(a<b) {
            System.out.println("a<b");
        } else {
            System.out.println("a>=b");
        }
        if(a==b) {
            System.out.println("a==b");
        } else if(a == 200) {
            System.out.println("a==200");
        } else if( a>b) {
            System.out.println("a>b");
        } else {
            System.out.println("上面条件都不中");
        }
    }
}
