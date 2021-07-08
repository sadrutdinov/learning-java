package pro.chapter7;

public class UseStatic {
    static int a = 3;
    static int b;


    static {
        System.out.println("static block init");
        b = a * 4;
    }

    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public void print() {
        System.out.println("не статический метод");
    }

    public static void main(String[] args) {
        meth(42);
        UseStatic useStatic = new UseStatic();
        useStatic.print();
    }
}
