package src.array;

public class DoubleArrayDemo {
    public static void main(String[] args) {
        /*
        * 二维数组
        * */
        int [] [] arr = {{1,2,3,4},{2,3,4},{5,6,78}};

        System.out.println(arr.length);

        for (int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                System.out.println("i:"+i+"j:"+j+" = " + arr[i][j]);
            }
        }
    }
}
