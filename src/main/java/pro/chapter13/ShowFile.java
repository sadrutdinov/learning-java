package pro.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int t;

        String fileName = "C:\\Users\\a.i.sadrutdinov\\IdeaProjects\\JavaTest\\src\\main\\java\\pro\\chapter13\\test.txt";


        try (FileInputStream fileInputStream = new FileInputStream(fileName)){

            do {
                t = fileInputStream.read();
                if (t != -1) {
                    System.out.print((char) t);
                }
            } while (t != -1);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("шото не так");
        }


    }
}
