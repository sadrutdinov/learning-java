package pro.chapter11;

public class SomeThread extends Thread{

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    SomeThread(String name) {
        super(name);
    }
}

class Examples {
    public static void main(String[] args) {
        SomeThread test = new SomeThread("2");
        test.start();
        SomeThread test1 = new SomeThread("3");
        test1.start();
    }
}
