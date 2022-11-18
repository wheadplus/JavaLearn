package src.array;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int [] arr1 = new int[]{1,2,3,5};
        int [] arr2 = new int[]{1,2,3,5};
        int [] arr3 = new int[]{1,5,7,9};

        // 数组是否相等
        System.out.println(Arrays.equals(arr1,arr2));
        System.out.println(Arrays.equals(arr1,arr3));

        // 添加元素
        Arrays.fill(arr3, 11);
        System.out.println(Arrays.toString(arr3));

        // 排序
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
