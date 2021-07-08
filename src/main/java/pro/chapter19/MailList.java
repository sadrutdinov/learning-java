package pro.chapter19;

import pro.chapter8.A;

import java.util.LinkedList;
import java.util.RandomAccess;

public class MailList {
    public static void main(String[] args) {
        LinkedList<Address> m1 = new LinkedList<>();

        m1.add(new Address("Aydar", "Babushkina", "Izh", "UR", "426000"));
        m1.add(new Address("Kate", "Lenina", "Izh", "UR", "426000"));
        m1.add(new Address("Anton", "Pushka", "Izh", "UR", "426000"));
        m1.add(new Address("Ivan", "Telegina", "Izh", "UR", "426000"));

        for (Address address: m1
             ) {
            System.out.println(address);
            System.out.println();
        }

        System.out.println(m1 instanceof RandomAccess);
    }
}
