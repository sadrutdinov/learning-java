package pro.chapter8;

public abstract class Dad {
    abstract void callMe();

    void callMeTo() {
        System.out.println("я конкретный метод");
    }
}

class Son extends Dad {

    @java.lang.Override
    void callMe() {
        System.out.println("реализация метода callMe в классе Son");
    }
}

class AbstractDemo {
    public static void main(String[] args) {
        Son son = new Son();
        son.callMe();
        son.callMeTo();

        Dad dad = new Son();
        dad.callMe();
        dad.callMeTo();


    }
}
