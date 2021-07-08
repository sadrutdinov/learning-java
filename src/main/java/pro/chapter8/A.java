package pro.chapter8;

public class A {
    int i, j;

    void showInt() {
        System.out.println("i: " + i + "\nj: " + j);
    }
}

class B extends A {
    int k;

    void showK() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i + j + k: " + (i + j + k));
    }
}

class Demo {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        superOb.i = 10;
        superOb.j = 10;
        System.out.println("superOb");
        superOb.showInt();
        System.out.println();

        subOb.k = 12;
        subOb.i = 12;
        subOb.j = 12;
        System.out.println("subOb");
        subOb.showK();
        subOb.showInt();
        subOb.sum();


    }
}
