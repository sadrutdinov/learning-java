package pro.chapter19;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Double> treeMap = new TreeMap();

        treeMap.put("Джон доу", new Double(3434.34));
        treeMap.put("Том Смит", new Double(123.22));
        treeMap.put("Джейн Бейкер", new Double(1378.00));
        treeMap.put("Тод Халл", new Double(99.22));
        treeMap.put("Ральф Смит", new Double(-19.08));

        treeMap.entrySet().stream().forEach(p -> System.out.println(p.getKey() + " : " + p.getValue()));


        double balance = treeMap.get("Джон доу");

        treeMap.put("Джон доу", balance + 1000);

        System.out.println("новый остаток на счете джона доу: " + treeMap.get("Джон доу"));
    }
}
