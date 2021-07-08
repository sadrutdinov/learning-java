package pro.chapter19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/** то шо Итератор и ЛистИтератор  **/

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> array = new ArrayList<>();
        array.add("a");
        array.add("b");
        array.add("c");
        array.add("d");
        array.add("e");
        array.add("f");

        Iterator<String> iterator = array.iterator();

        System.out.println("исходное содержимое списочного массива");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        // вот тут меняем массив брат
        ListIterator<String> listIterator = array.listIterator();
        while (listIterator.hasNext()) {
            listIterator.set(listIterator.next() + " - это буква брат");

        }


        // а вот тут ежжи выводим измененный массив
        System.out.println("\nа вот тут уже поменяли ежжи");
        iterator = array.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nобратный порядок ежжи");

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }




    }
}
