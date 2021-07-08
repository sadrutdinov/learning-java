package pro.chapter7;

class Outer {
    int outer_x = 100;


    void test() {
        Inner inner = new Inner();
        inner.display();
        System.out.println(inner.inner_x);
    }

    // Inner Class
    class Inner {

        int inner_x = 200;

        void display() {
            System.out.println("вывод: outer_x = " + outer_x);
        }
    }
}

class InnerDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}
