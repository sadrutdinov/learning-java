package pro.chapter11;

public class NewThread2 extends Thread{

    NewThread2() {
        super("демонстрационный поток");
        System.out.println("дочерний поток: " + this);
        start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван");
        }
        System.out.println("Дочерний поток завершен");
    }
}

class ExtendThread {
    public static void main(String[] args) {
        new NewThread2();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);

            }
        } catch (InterruptedException e) {
            System.out.println("главный поток прерван");
        }
        System.out.println("главный поток завершен");

    }

}
