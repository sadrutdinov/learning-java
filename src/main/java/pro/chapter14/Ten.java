package pro.chapter14;

/**
 * демонстрация последствий динамической идентификации типов в иерархии обобщенных классов
 **/

public class Ten<T> {
    T ob;

    public T getOb() {
        return ob;
    }

    public Ten(T ob) {
        this.ob = ob;
    }
}

class Ten2<T> extends Ten<T> {

    public Ten2(T ob) {
        super(ob);
    }
}

class HierDemo3 {
    public static void main(String[] args) {
        Ten<Integer> iob = new Ten<>(88);
        Ten2<Integer> iob2 = new Ten2<>(99);
        Ten2<String> strOb2 = new Ten2<>("Тест обобщений");

        if (iob2 instanceof Ten2<?>) {
            System.out.println("объект iob2 является экземпляром класса Ten2");
        }
        if (iob instanceof Ten<?>) {
            System.out.println("объект iob является экземпляром класса Ten");
        }
        if (iob2 instanceof Ten<?>) {
            System.out.println("объект iob2 является экземпляром класса Ten");
        }
        if (strOb2 instanceof Ten2<?>) {
            System.out.println("объект strOb2 является экземпляром класса Ten2");
        }
        if (strOb2 instanceof Ten<?>) {
            System.out.println("объект strOb2 является экземпляром класса Ten");
        }

        if (iob instanceof Ten2<?>) {
            System.out.println("объект iob является экземпляром класса Ten2");
        }



    }
}
