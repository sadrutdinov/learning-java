package pro.chapter15;

import pro.chapter13.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class MyClass {
    private int val;

    public int getVal() {
        return val;
    }

    public MyClass(int val) {
        this.val = val;
    }
}

class UseMethodRef {
    // метод compare(), совместимый с наналогичным методом, опрделенным в интерфейсе Comparator<T>
    static int compareMyClass(MyClass a, MyClass b) {
        // возвращает положительное, если 1 элемент больше второго, 0 если равны, отрицательное если 2 > 1
        return a.getVal() - b.getVal();
    }

    public static void main(String[] args) {
        ArrayList<MyClass> al = new ArrayList<>();
        al.add(new MyClass(1));
        al.add(new MyClass(4));
        al.add(new MyClass(2));
        al.add(new MyClass(9));
        al.add(new MyClass(3));
        al.add(new MyClass(7));

        MyClass maxValObj = Collections.max(al, UseMethodRef::compareMyClass);
        System.out.println(maxValObj.getVal());



    }


}

