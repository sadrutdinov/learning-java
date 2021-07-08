package pro.chapter11.youtube;

public class Test {
    String s;

    public Test(String s) {

    }

    public Test() {
        s = "default";
    }

    public static void main(String[] args) {
        System.out.println(new Test().s);
    }
}
