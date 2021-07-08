package pro.chapter21;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;

        // для автоматического закрытия потока ввода испольсуейтся трай с ресурсами
        try (FileInputStream f = new FileInputStream("src/main/java/pro/chapter21/FileInputStreamDemo.java")) {
            System.out.println("общее количество доступных байтов: " + (size = f.available()));

            int n = size/40;
            System.out.println("первые "+ n +" байтов, прочитанных из файла методом read(): ");

            for (int i = 0; i < n; i++) {
                System.out.print((char) f.read());
            }

            System.out.println("все еще доступно: " + f.available());
            System.out.println("чтение следующих ");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
