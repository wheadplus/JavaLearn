package src.a_base;

public class WhileDemo {
    public static void main(String[] args) {
        /*

        初始化表达式1
        while(布尔表达式2){
            循环体3
            步进体4
        }  */


        int sum = 0;
        int i = 1;
        while (i<11) {
            sum += i;
            i++;
        }
        System.out.println(sum);

        while (1<2) {
            System.out.println('h');
            //不break就死循环
            break;
        }
    }
}
