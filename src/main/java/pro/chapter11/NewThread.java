package pro.chapter11;

public class NewThread implements Runnable {
    String name;
    Thread t;

    NewThread(String name) {
        this.name = name;
        t = new Thread(this, name);
        System.out.println("новый поток создан " + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван");
        }
        System.out.println(name + " завершен");
    }
}

