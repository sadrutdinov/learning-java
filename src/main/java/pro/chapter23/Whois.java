package pro.chapter23;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Whois {
    public static void main(String[] args) throws Exception {
        int c;

        // создать сокетное соединение с веб-сайтом internic.net через порт 43
        Socket s = new Socket("whois.internic.net", 80);

        // получить потоки ввода-вывода
        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();


        // сформировать строку запроса
        String str = (args.length == 0 ? "OraclePressBooks.com" : args[0] ) + "\n";

        byte[] buf = str.getBytes();

        out.write(buf);

        while ((c = in.read()) != -1) {
            System.out.println((char) c);
        }

        s.close();

    }
}
