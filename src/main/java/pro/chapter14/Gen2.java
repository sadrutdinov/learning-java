package pro.chapter14;

/**
 пример обобщенного класса без аргументов
 **/


public class Gen2<T> {
    T ob;

    public Gen2(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }
}

class RawDemo {
    public static void main(String[] args) {
        Gen2<Integer> iob = new Gen2<>(13);
        Gen2<String> sob = new Gen2<>("Hello");


    }
}