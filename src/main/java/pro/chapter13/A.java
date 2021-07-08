package pro.chapter13;

public class A {
    int i, j;
}

class B {
    int i, j;
}

class C extends A {
    int k;
}

class D extends A {
    int k;
}

class InstanceOf {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        if (a instanceof A) {
            System.out.println("a вляется экземпляром А");
        }
        if (b instanceof B) {
            System.out.println("b вляется экземпляром B");
        }
        if (c instanceof C) {
            System.out.println("c вляется экземпляром C");
        }
        if (c instanceof A) {
            System.out.println("c можно привести к типу А");
        }
        if (a instanceof C) {
            System.out.println("a можно привести к типу C");
        }

        System.out.println();

        A ob;
        ob = d;

        System.out.println("od теперь ссылается на D");
        if (ob instanceof D) {
            System.out.println("ob является экземпляром D");
        }

    }
}
