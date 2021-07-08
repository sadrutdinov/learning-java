package pro.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        int i;


        String inputFileName = "src/main/resources/test.txt";
        String outputFileName = "src/main/resources/test2.txt";





        try (FileInputStream fis = new FileInputStream(inputFileName);
             FileOutputStream fos = new FileOutputStream(outputFileName)) {

            do {
                i = fis.read();
                if (i != -1) {
                    fos.write((char) i);
                    System.out.print((char) i);
                }
            } while (i != -1);

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("нет файла");
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }
}
