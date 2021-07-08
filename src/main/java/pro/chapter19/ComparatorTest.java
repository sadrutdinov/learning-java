package pro.chapter19;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {
    public static void main(String[] args) {
        Integer[] array = new Integer[] {312, 43, 535, 34, 4325, 1234, 8, 864, 3456, 523, 25235, 52, 2532, 23};
        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(array));



    }
}
