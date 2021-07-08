package pro.chapter10;

public class ExceptionDemo {
    static void compute(int a) throws MyException {
        System.out.println("in method compute(), a: " + a);

        if (a > 10) {
            throw new MyException(a);
        }
        System.out.println("normal end");
    }

    public static void main(String[] args) {

        try {
            compute(1);
            compute(20);
        } catch (MyException e) {
            System.out.println("get Exception: " + e);
            System.out.println(e.getCause());
        }
    }
}
