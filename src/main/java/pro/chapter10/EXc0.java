package pro.chapter10;

public class EXc0 {
    public static void main(String[] args) {
        int d = 0;
        try {
            int a = 42 /d;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("crash");
        }
    }
}
