package pro.chapter19;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        arrayDeque.push("A");
        arrayDeque.push("B");
        arrayDeque.push("C");
        arrayDeque.push("D");
        arrayDeque.push("E");
        arrayDeque.push("F");

        System.out.println(arrayDeque);

//        while (arrayDeque.peek()!= null) {
//            System.out.println(arrayDeque.pop() + " ");
//        }


        Iterator<String> iterator = arrayDeque.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }
}
