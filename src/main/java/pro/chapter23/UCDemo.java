package pro.chapter23;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class UCDemo {
    public static void main(String[] args) throws IOException {
        int c;
        URL hp = new URL("https://www.internic.net/");
        URLConnection hpCon = hp.openConnection();

        long d = hpCon.getDate();

        System.out.println(new Date(d));
        System.out.println(hpCon.getContentType());
        System.out.println(new Date(hpCon.getLastModified()));


        InputStream inputStream = hpCon.getInputStream();

        System.out.println("===Content===");

        while (((c = inputStream.read()) != -1)) {
            System.out.print((char) c);
        }
        inputStream.close();


        //903


        System.out.println();
    }
}
