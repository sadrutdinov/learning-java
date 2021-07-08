package pro.chapter19;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("Aydar", 15634562);
        hm.put("Kate", 312423);
        hm.put("Lili", 976232);
        hm.put("Yula", 125);

        Set<Map.Entry<String, Integer>> set = hm.entrySet();

        for (Map.Entry<String, Integer> me : set
        ) {
            System.out.println(me.getKey() + " : " + me.getValue());
        }

        hm.put("Aydar", hm.get("Aydar") + 121312);

        System.out.println(hm.get("Aydar"));

        set.forEach(p -> System.out.println(p.getKey() + " : " + p.getValue()));
    }
}
