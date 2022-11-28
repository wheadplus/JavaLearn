package src.b_array;

public class ArrayForEachDemo {
    public static void main(String[] args) {
        int [] arr = new int [] {1,2,3};
        int [] arr2 = {1,2,3,67};

        printArray(arr2);
    }

    public static void printArray(int [] array) {
        for(int i=0;i<array.length;i++) {
            System.out.println("arr["+i+"]=" + array[i]);
        }
    }
}
