package pro.chapter8;

public class C {
    void callMe() {
        System.out.println("in method callMe() from class C");
    }
}

class D extends C {
    void callMe() {
        System.out.println("in method callMe() from class D");
    }
}

class E extends C {
    void callMe() {
        System.out.println("in method callMe() from class E");
    }
}

class Dispatch {
    public static void main(String[] args) {
        C c = new C();
        D d = new D();
        E e = new E();

        C r; // get link C

        r = c;
        r.callMe();

        r = d;
        r.callMe();

        r = e;
        r.callMe();
    }
}

