import java.sql.SQLOutput;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
       Random generator = new Random();

       int throw1 = generator.nextInt(6) + 1;
       int throw2 = generator.nextInt(6) + 1;
       int throw3 = generator.nextInt(6) + 1;

       int sum = throw1 + throw2 + throw3;

        System.out.println("Roll: 1" + " Die 1: " + throw1);
        System.out.println("Roll: 2" + " Die 2: " + throw2);
        System.out.println("Roll: 3" + " Die 3: " + throw3);
        System.out.println("The sum of the three: " + sum);

    }
}