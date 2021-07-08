package pro.chapter21;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream f = new ByteArrayOutputStream();
        String s = "hi friend";

        byte[] buf = s.getBytes(StandardCharsets.UTF_8);

        try {
            f.write(buf);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("буффер в виде символьной строки");
        System.out.println(f.toString());

        System.out.println("в массив");

        byte[] bytes = f.toByteArray();

        for (int i = 0; i < bytes.length; i++) {
            System.out.print((char)bytes[i]);
        }


    }
}
