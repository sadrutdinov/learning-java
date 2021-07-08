package pro.chapter14;


/**
обощенные интерфейсы
**/

public interface MinMax<T extends Comparable<T>> {
    T min();

    T max();
}

class MyClass<T extends Comparable<T>> implements MinMax<T> {

    T[] values;

    public MyClass(T[] values) {
        this.values = values;
    }

    @Override
    public T min() {
        T v = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i].compareTo(v) < 0) {
                v = values[i];
            }

        }

        return v;
    }

    @Override
    public T max() {
        T v = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i].compareTo(v) > 0) {
                v = values[i];
            }

        }

        return v;
    }
}

class GenIfDemo {
    public static void main(String[] args) {
        Integer[] inums = {1, 2, 3, 4};
        Character[] cnums = {'s', 'd', 'd', 's'};

        MyClass<Integer> iob = new MyClass<>(inums);
        MyClass<Character> cob = new MyClass<>(cnums);

        System.out.println(iob.min());
        System.out.println(iob.max());

        System.out.println(cob.min());
        System.out.println(cob.max());
    }
}
