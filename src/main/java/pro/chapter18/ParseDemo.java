package pro.chapter18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParseDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String str;
        int i;
        int sum = 0;

        System.out.println("введите число, для выхода 0");

        do {
            str = bufferedReader.readLine();
            i = Integer.parseInt(str);
            System.out.println(i);
            sum += i;
            System.out.println("sum: " + sum);
        } while (i != 0);

    }
}
