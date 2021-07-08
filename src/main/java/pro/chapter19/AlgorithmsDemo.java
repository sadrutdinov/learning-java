package pro.chapter19;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithmsDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);

        Comparator<Integer> r = Collections.reverseOrder();

        Collections.sort(ll, r);

        System.out.print("Список отсортирован в обратном порядке: ");

        ll.forEach(p-> System.out.print(p + " "));

        System.out.println();

        Collections.shuffle(ll);

        System.out.print("Перетасованный список: ");

        ll.forEach(p -> System.out.print(p + " "));

        System.out.println();
        System.out.println(Collections.max(ll));
        System.out.println(Collections.min(ll));


    }
}
