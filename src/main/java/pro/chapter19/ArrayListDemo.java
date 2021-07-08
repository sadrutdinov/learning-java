package pro.chapter19;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.ensureCapacity(1000);

        for (int i = 0; i < 100; i++) {
            al.add(i);
        }




        Integer[] array = new Integer[al.size()];
        array = al.toArray(array);

        int sum = 0;

        for (int i: array
             ) {
            sum+=i;
        }

        System.out.println(sum);



    }
}
