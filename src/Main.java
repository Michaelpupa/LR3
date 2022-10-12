import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int I = 123456;
        float d1, d2;
        float f = 14.75F;
        char c1;
        //2
        I = Math.round(f);
        Random random = new Random();
        d1  = random.nextFloat(1000);
        d2  = random.nextFloat(99);
        System.out.println("I = "+I);
        System.out.println("d1 = "+d1);
        System.out.println("d2 = "+d2);
    }
}