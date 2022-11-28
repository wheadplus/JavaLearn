package src.b_array;

public class CreateArrayDemo {
    public static void main(String[] args) {

        // 格式1：数组动态初始化，只给定数组长度，系统默认初始值
        int [] arr1 = new int[3];
        // 格式2： 静态初始化，在创建数组时，直接确定好元素
        int [] arr2 = new int[]{1,2,3};
        // 格式3： 静态初始化，简化写法
        int [] arr3 = {1,2,3};

        //数组元素
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);

        System.out.println(arr3[1]);
        System.out.println(arr3[2]);

        //数组长度
        System.out.println("arr3的长度"+arr3.length);

        // 数组越界，只有3个元素，超过了
        System.out.println(arr2[5]);
    }
}
