package pro.chapter18;

import java.io.IOException;
import java.util.Map;

public class PBDemo {
    public static void main(String[] args) {
        ProcessBuilder proc = new ProcessBuilder("notepad.exe", "testfile");
        try {
            proc.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<String, String> env = proc.environment();

        for (Map.Entry<String, String> entry: env.entrySet()
             ) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

    }
}
