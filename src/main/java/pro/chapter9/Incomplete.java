package pro.chapter9;

abstract class Incomplete implements Callback{
    int a, b;

    void show() {
        System.out.println(a + " " + b);
    }
}
