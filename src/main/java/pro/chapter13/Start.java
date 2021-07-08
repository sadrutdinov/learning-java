package pro.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {
    public static void main(String [] args) throws IOException {
        String q;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));




        do {
            q = bufferedReader.readLine();
        }while (!q.equals("стоп"));


    }
}
