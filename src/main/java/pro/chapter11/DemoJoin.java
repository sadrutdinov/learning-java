package pro.chapter11;

public class DemoJoin {
    public static void main(String[] args) {

        NewThread ob1 = new NewThread("Один");
        NewThread ob2 = new NewThread("Два");
        NewThread ob3 = new NewThread("Три");

        System.out.println("Поток 1 запущен: " + ob1.t.isAlive());
        System.out.println("Поток 2 запущен: " + ob2.t.isAlive());
        System.out.println("Поток 3 запущен: " + ob3.t.isAlive());

        try {

            System.out.println("ожидание завершения потоков");
            // вызывающий поток (main) ожидает, когда указанный поток присоединиться к нему

            // main ждет, огда кончится 1-ый
            ob1.t.join();
            // main ждет, огда кончится 2-ой
            ob1.t.join();
            // main ждет, огда кончится 3-ий
            ob1.t.join();

        } catch (InterruptedException e) {

            System.out.println("Главный поток прерван");

        }

        System.out.println("Поток 1 запущен: " + ob1.t.isAlive());
        System.out.println("Поток 2 запущен: " + ob2.t.isAlive());
        System.out.println("Поток 3 запущен: " + ob3.t.isAlive());

        System.out.println("Главный поток завершен");

    }



}
