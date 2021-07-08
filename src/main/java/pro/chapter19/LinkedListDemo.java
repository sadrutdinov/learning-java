package pro.chapter19;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("F");
        linkedList.add("B");
        linkedList.add("D");
        linkedList.add("E");
        linkedList.add("C");
        linkedList.addLast("Z");
        linkedList.addFirst("A");

        linkedList.add(1, "A2");

        System.out.println(linkedList);

        linkedList.remove("F");
        linkedList.remove(2);

        System.out.println(linkedList);

        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println(linkedList);

        String val = linkedList.get(2);
        linkedList.set(2, val + " change");

        System.out.println(linkedList);

    }

}
