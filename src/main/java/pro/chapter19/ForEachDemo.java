package pro.chapter19;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            array.add(i);
        }


        int sum = 0;

        for (int x: array
             ) {
            System.out.print(x + " ");
            sum += x;
        }

        System.out.println("\n" + sum);
    }
}
