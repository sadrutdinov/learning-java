package pro.chapter19;

import pro.chapter8.C;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] array = new int[10];


        // int[] array2 = IntStream.range(0, 10).map(p -> p * (-3)).toArray();
        for (int i = 0; i < 10; i++) {
            array[i] = -3 * i;
        }

        System.out.print("исходный массив: ");
        display(array);

        Arrays.sort(array);

        System.out.print("Отсортированный массив: ");
        display(array);

        Arrays.fill(array, 2, 6, -1);
        System.out.print("массив после вызова метода fill(): ");
        display(array);

        Arrays.sort(array);
        System.out.print("Отсортированный повторно массив: ");
        display(array);

        System.out.print("Значение -9 находится на позиции : ");
        int index = Arrays.binarySearch(array, -9);
        System.out.println(index);



        // заполнить массив значением
        //Arrays.fill(array, 12);


        //Arrays.sort(array);


    }

    static void display(int[] array) {
        Arrays.stream(array).forEach(p -> System.out.print(p + " "));
        System.out.println();
    }
}
