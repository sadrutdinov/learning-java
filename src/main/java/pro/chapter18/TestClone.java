package pro.chapter18;

public class TestClone implements Cloneable {
    int a;
    double b;

    TestClone cloneTest() {
        try {
            return (TestClone) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return this;
        }
    }

}

class CloneDemo {
    public static void main(String[] args) {
        TestClone x1 = new TestClone();
        TestClone x2;
        x1.a = 10;
        x1.b = 21;
        x2 = x1.cloneTest();

        System.out.println(x1==x2);
        System.out.println("x1: " + x1.a + " " + x1.b);
        System.out.println("x2: " + x2.a + " " + x2.b);
    }
}
