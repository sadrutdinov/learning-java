package pro.chapter19;

import pro.chapter8.A;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorDemo {
    public static void main(String[] args) {
        List<Double> vals = new ArrayList<>();

        for (int i = 1; i < 6; i++) {
            vals.add((double) i);
        }

        System.out.println("содержание списочного массива vals:");

        Spliterator<Double> spliterator = vals.spliterator();
        ;

        while (spliterator.tryAdvance(n -> System.out.println(n))) ;

        System.out.println();

        spliterator = vals.spliterator();


        // создать новый списочный массив, содержащий квадраты первого
        List<Double> sqrs = new ArrayList<>();
        while (spliterator.tryAdvance(n -> sqrs.add(Math.sqrt(n)))) ;


        // вызвать метод forEachRemaining() для вызова содержимого списочного массива sqrs

        System.out.println("содержимое списочного массива sqrs:");

        spliterator = sqrs.spliterator();

        spliterator.forEachRemaining(n -> System.out.println(n));

        System.out.println(spliterator.characteristics());


    }
}
