package pro.chapter21;

import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        String s = null;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        try {

            s = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(System.out);
            objectOutputStream.writeObject(s);
        } catch (IOException e) {
            e.printStackTrace();
        }



        System.out.println(s);
    }
}
