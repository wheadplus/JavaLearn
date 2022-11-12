package src.base;

public class ForDemo {
    public static void main(String[] args) {

        /*
        * */

        for(int i=0;i<3;i++) {
            System.out.println("hello");
            System.out.println(i);
        }

        int sum = 0;
        for(int i=1;i<11;i++) {
            System.out.println(sum+ "+" + i);
            sum += i;
        }

        System.out.println(sum);

        int sum2 = 0;
        for (int i=10;i>0;i--) {
            System.out.println(sum2+ "+" + i);
            sum2 += i;
        }
        System.out.println(sum2);
    }
}
