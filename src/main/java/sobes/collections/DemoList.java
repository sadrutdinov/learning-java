package sobes.collections;

import java.util.*;

/**
 * может содержать дубликаты
 * можно получать элемент по индекусу
 * <p>
 * Реализации:
 * ArrayList - не синхронизирована, поэтому быстрая
 * LinkedList - не синхронизирована, поэтому быстрая
 * Stack (уст) - синхронизирована, из-за это медленная
 * Vector (уст) - синхронизирована, из-за это медленная
 */
public class DemoList {
    List<String> arrayList = new ArrayList<>();
    List<String> linkedList = new LinkedList<>();


    // метод, возвращающий синхронизироыванный лист
    List<String> getSynchronizedList() {
        return Collections.synchronizedList(arrayList);
    }

    public static void main(String[] args) {
        //arrayListExamples();
        linkedListExamples();
    }

    public static void arrayListExamples() {
        List<Car> cars = new ArrayList<>();

        Car car1 = new Car("BMW");
        Car car2 = new Car("Niva");
        Car car3 = new Car("Nissan");
        Car car4 = new Car("Nissan");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4); // можно добавлять дубли

        cars.add(new Car("Toyota"));

        System.out.println("cars.size: " + cars.size());

        // содержит ли коллекция определенный объект
        System.out.println("cars.contains(car2) - " + cars.contains(car2));

        int index = cars.indexOf(car3);

        System.out.println("index car3 - " + index);

        Car selectedCar = cars.get(3);

        System.out.println("selectedCar - " + selectedCar);


        Iterator<Car> iterator = cars.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }

        cars.clear();

        System.out.println("cars.isEmpty() - " + cars.isEmpty());
    }


    public static void linkedListExamples() {
        LinkedList<Car> cars = new LinkedList<>();

        Car car1 = new Car("BMW");
        Car car2 = new Car("Niva");
        Car car3 = new Car("Nissan");
        Car car4 = new Car("Nissan");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        cars.addLast(car1);

        Iterator<Car> iterator = cars.descendingIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }

}
