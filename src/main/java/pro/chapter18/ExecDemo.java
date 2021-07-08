package pro.chapter18;

import java.io.IOException;

public class ExecDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Process p = null;

        try {
            p = r.exec("Notepad");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
