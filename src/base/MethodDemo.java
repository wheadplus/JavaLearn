package src.base;

public class MethodDemo {
    public static void main(String[] args) {
        int sum = getSum(1,2);
        System.out.println(sum);

        int sum2 = getSum(1,2,3);
        System.out.println(sum2);

        int sum3 = 佳佳(1,2);
        System.out.println(sum3);
    }

    public static int getSum(int a, int b) {
        return a+b;
    }
    /*
        方法的重载，根据参数不同调用不同的getSum
    * */
    public static int getSum(int a,int b,int c) {
        return a+b+c;
    }
    public static int 佳佳(int a, int b){
        return a+b;
    }
}
