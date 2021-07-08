package pro.chapter19;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();

        hashSet.add("меня");
        hashSet.add("зовут");
        hashSet.add("айдар");
        hashSet.add("а");
        hashSet.add("тебя");
        hashSet.add("как");

        System.out.println(hashSet);

        for (String s: hashSet
        ) {
            System.out.println(s.hashCode());
        }
    }
}
