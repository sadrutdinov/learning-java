package pro.chapter18;

public class NewThread extends Thread {
    boolean suspendFlag;

    NewThread(String threadName, ThreadGroup tgOb) {
        super(tgOb, threadName);
        System.out.println("Новый поток " + this);
        suspendFlag = false;
        start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(getName() + ": " + i);
                Thread.sleep(1000);
                synchronized (this) {
                    while(suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("исключение в " + getName());
        }
        System.out.println(getName() + " завершается.");
    }

    synchronized void mySuspend() {
        suspendFlag = true;
    }

    synchronized void myResume() {
        suspendFlag = false;
        notify();
    }
}

class ThreadGroupDemo {
    public static void main(String[] args) {
        ThreadGroup groupA = new ThreadGroup("группа А");
        ThreadGroup groupB = new ThreadGroup("группа B");

        NewThread ob1 = new NewThread("Один", groupA);
        NewThread ob2 = new NewThread("Два", groupA);
        NewThread ob3 = new NewThread("Три", groupB);
        NewThread ob4 = new NewThread("Четыре", groupB);

        System.out.println("\n вывод из метода list():");
        groupA.list();
        groupB.list();
        System.out.println();

        System.out.println("прерывается группа A");
        Thread[] tga = new Thread[groupA.activeCount()];
        groupA.enumerate(tga);
        for (int i = 0; i < tga.length; i++) {
            ((NewThread)tga[i]).mySuspend();
        }

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("возобновление группы A");

        for (int i = 0; i < tga.length; i++) {
            ((NewThread)tga[i]).myResume();
        }

        try {
            System.out.println("ожидание завершения поток осполнения");
            ob1.join();
            ob2.join();
            ob3.join();
            ob4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
