package pro.chapter2;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println(" int to byte");
        b = (byte) i;
        System.out.printf("i = %d, b = %d\n\n", i, b);

        System.out.println("double to int");
        i = (int) d;
        System.out.printf("d = %f, i = %d\n\n", d, i);

        System.out.println("double to byte");
        b = (byte) d;
        System.out.printf("d = %f, b = %d\n\n", d, b);

        System.out.println(d);




    }
}
