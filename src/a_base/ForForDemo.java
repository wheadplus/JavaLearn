package src.a_base;

public class ForForDemo {
    public static void main(String[] args) {
        for(int hour=0;hour<24;hour++) {
            for(int min=0;min < 60;min++) {
                System.out.println(hour+ "h:"+min+"m");
            }
            System.out.println("-----");
        }
    }
}
