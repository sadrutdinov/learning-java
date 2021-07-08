package pro.chapter10;

public class SuperSuubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42/ a;

        } catch (ArithmeticException e) {
            System.out.println("этот код недостижим");
        } catch (Exception e) {
            System.out.println("перехват исключений общего класса Exception");

        }
    }
}
