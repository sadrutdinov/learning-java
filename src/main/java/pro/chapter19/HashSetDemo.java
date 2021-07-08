package pro.chapter19;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

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
