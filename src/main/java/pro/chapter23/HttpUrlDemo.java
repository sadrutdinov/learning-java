package pro.chapter23;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class HttpUrlDemo {
    public static void main(String[] args) throws IOException {
        URL hp = new URL("http://www.google.com");

        HttpURLConnection hpCon = (HttpURLConnection)hp.openConnection();

        // request method

        System.out.println("request method: " + hpCon.getRequestMethod());

        System.out.println("response code: " + hpCon.getResponseCode());

        System.out.println("ответное сообщение: "  + hpCon.getResponseMessage());


        Map<String, List<String>> hdrMap = hpCon.getHeaderFields();

        hdrMap.entrySet().forEach(p -> System.out.println("key: " + p.getKey()+ " value: " + p.getValue()));



    }
}
