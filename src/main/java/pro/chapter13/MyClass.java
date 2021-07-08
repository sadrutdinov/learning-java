package pro.chapter13;

public class MyClass {
    int a;
    int b;

    MyClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    MyClass(int a) {
        this(a, a);
    }

    MyClass() {
        this(0);
    }

    public static void main(String[] args) {
        MyClass my = new MyClass();

        System.out.println(my.a);
        System.out.println(my.b);
    }
}
