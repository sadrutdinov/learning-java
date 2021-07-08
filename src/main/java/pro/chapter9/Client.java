package pro.chapter9;

public class Client implements Callback {

    @Override
    public void callback(int p) {
        System.out.println(p);
    }

    void nonIfaceMeth () {
        System.out.println("ниче не знаю про интерфейсы ваши");
    }
}
