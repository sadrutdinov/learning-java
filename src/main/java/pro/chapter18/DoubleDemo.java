package pro.chapter18;

public class DoubleDemo {
    public static void main(String[] args) {
        Double d1 = 3.131241;

        Double d2 = Double.valueOf("3.131241");

        System.out.println(d1.equals(d2));

        System.out.println(d2 * 2);

        Double d3 = Double.valueOf(0/0.);
        System.out.println(d3.isNaN());
    }
}
