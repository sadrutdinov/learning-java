package pro.chapter15;

/** применение ссылки на обощенный метод, объявленный в необощенном классе **/

interface MyFunc2<T> {
    int func(T[] vals, T v);
}

public class MyArrayOps {
    static <T> int countMatching(T[] vals,  T v) {
        int count = 0;

        for (int i = 0; i < vals.length; i++) {
            if (vals[i] == v) {
                count++;
            }
        }

        return count;
    }
}

class GenericMethodRefDemo {
    //в качестве первого параметра этого метода указывается функциональный интерфейс MyFunc2
    static <T> int muOp (MyFunc2<T> f, T[] vals, T v) {
        return f.func(vals, v);
    }

    public static void main(String[] args) {
        Integer[] vals = {1, 2, 3, 2, 5, 2, 5};
        String[] strs = {"Один", "Два", "Два", "Два", "Два"};
        int count;

        count = muOp(MyArrayOps::<Integer>countMatching, vals, 2);
        System.out.println("количество 2 в массиве vals: " + count);

        count = muOp(MyArrayOps::<String>countMatching, strs, "два");
        System.out.println("количество \"два\" в массиве strs: " + count);


    }
}
