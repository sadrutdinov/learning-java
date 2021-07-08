package pro.chapter20;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AvgFile {
    public static void main(String[] args) throws IOException {
        int count = 0;
        double sum = 0.0;

        FileWriter fout = new FileWriter("src/main/resources/test.txt");
        fout.write("2 5 3 3 5 7 45 5 готово");
        fout.close();

        FileReader fin = new FileReader("src/main/resources/test.txt");

        Scanner scanner = new Scanner(fin);

        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                sum += scanner.nextDouble();
                count++;
            }
            else {
                String str = scanner.next();
                if (str.equals("готово")) {
                    break;
                }
                else {
                    System.out.println("ошибка формата данных");
                    return;
                }
            }
        }

        scanner.close();
        System.out.println("среднее равно " + sum/count );

        //FileReader fin = new FileReader("test.txt");


    }
}
