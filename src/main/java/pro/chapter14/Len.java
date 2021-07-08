package pro.chapter14;

public class Len<T extends Number> {
    T ob;
    T vals[];

    public Len(T ob, T[] vals) {
        this.ob = ob;
        this.vals = vals;
    }
}

class GenArrays {
    public static void main(String[] args) {
        Integer[] n = {1, 2, 3, 4, 5};

        Len<Integer> iOb = new Len<>(50, n);

        Len<Integer> integerLen[] = new Len[10];
    }
}