package pro.chapter13;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Hypot {
    public static void main(String[] args) {
        double side1, side2;
        double hypot;

        side1 = 3;
        side2 = 4;

        hypot = sqrt(pow(side1, 2) + pow(side2,2));

        System.out.println(hypot);
    }
}
