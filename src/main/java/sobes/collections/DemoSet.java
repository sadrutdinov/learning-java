package sobes.collections;

import java.util.*;

/**
 * Set - не содержит одинковых значений, аналог множетсва в матане,
 * нельзя получить элемент по индексу, перебор с помощью итератора.
 * <p>
 * <p>
 * Реализации:
 * HashSet - В основе лежит HashMap. объект, внедряемый в Set является ключом,
 * значением является new Object(), самый быстрый, not ordered, not sorted
 * TreeSet - самый медленный, потому что сортирует, sorted
 * LinkedHashSet - ordered, расширяет HashSet
 * EnumSet
 */

public class DemoSet {
    public static void main(String[] args) {
        //hashSetExamples();
        //treeSetExamples();
       // linkedHashSetExamples();
    }

    private static void linkedHashSetExamples() {
        Set<Integer> set = new LinkedHashSet<>();

        set.add(374);
        set.add(271);
        set.add(677);
        set.add(273);
        set.add(6776);
        set.add(4753);
        set.add(273);

        Iterator<Integer> iterator = set.iterator();

        for (int x : set) {
            System.out.println(x);
        }
    }

    public static void hashSetExamples() {
        Set<Car> cars = new HashSet<>();

        Car car1 = new Car("BMW");
        Car car2 = new Car("Niva");
        Car car3 = new Car("Nissan");
        Car car4 = new Car("Nissan");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);


        Iterator<Car> iterator = cars.iterator();

        while (iterator.hasNext()) {
            Car car = iterator.next();
            System.out.println(car.getName());
        }
    }


    public static void treeSetExamples() {
        Set<Integer> treeSet = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        treeSet.add(34);
        treeSet.add(21);
        treeSet.add(67);
        treeSet.add(23);
        treeSet.add(676);
        treeSet.add(453);
        treeSet.add(23);

        Iterator<Integer> iterator = treeSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }


}
