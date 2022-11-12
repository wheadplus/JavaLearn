package src.base;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        /*
        * 用户输入1，2，3，4，5，6，7 输出对应星期几
        *  结构如下
        *  switch (表达式) {
            case 1:
                语句体1;
                break;
            case 2:
                语句体2;
                break;
            default:
                语句体n+1;
                break;
            }
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期几(1-7)");
        int week = sc.nextInt();
        switch (week) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
            default:
                System.out.println("你输入的星期数有误");
                break;
        }
        System.out.println("end");
    }
}
