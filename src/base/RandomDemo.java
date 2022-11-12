package src.base;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i=0;i<5;i++) {
            int num = random.nextInt(10);
            System.out.println("random number"+num);
        }
    }
}
