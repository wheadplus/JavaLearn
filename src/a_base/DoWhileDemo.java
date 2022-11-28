package src.a_base;

public class DoWhileDemo {
    public static void main(String[] args) {
        /*初始化表达式1;
        do{
          循环体3
          步进表达式4
        }while (布尔表达式2)
        */
        int x = 1;
        do {
            System.out.println("hi" + x);
            x++;
        } while (x <= 10);

        do {
            System.out.println("无条件执行1次");
        }while (false);
    }
}
