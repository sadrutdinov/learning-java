package pro.chapter21;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) throws IOException {
        String tmp = "abcdefghijklmnoprstuvwxyz";

        byte[] b = tmp.getBytes(StandardCharsets.UTF_8);

        //ByteArrayInputStream stream = new ByteArrayInputStream(b);
        ByteArrayInputStream stream1 = new ByteArrayInputStream(b, 0, 3);

        int available = stream1.available();

        int c = 0;


        while ((c = stream1.read()) != -1) {
            System.out.print((char)c);
        }
        // возвращает поток чтения в начало и позволяет темы самым читать его повторно

        stream1.reset();
        System.out.println();

        while ((c = stream1.read()) != -1) {
            System.out.print(Character.toUpperCase((char)c));
        }

    }
}
