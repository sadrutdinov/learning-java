package pro.chapter11;

public class Callme {
     void call (String msg) {
        System.out.print("[" + msg);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("]");
    }
}
// юзается потоками
class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;

    public Caller(String msg, Callme target) {
        this.msg = msg;
        this.target = target;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        synchronized (target) {
            target.call(msg);
        }

    }

}

class Synch {
    public static void main(String[] args) {
        Callme target = new Callme();

        Caller ob1 = new Caller("Добро пожаловать", target);
        Caller ob2 = new Caller("в синхронизированный", target);
        Caller ob3 = new Caller("мир", target);


        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
