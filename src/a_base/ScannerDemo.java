package src.a_base;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        /*
        *   Scanner 类获取用户输入
        * */

        Scanner input = new Scanner(System.in);
        if(input.hasNext()) {
            String str = input.nextLine();
            System.out.println("输出" + str);
        }
        input.close();
    }
}
