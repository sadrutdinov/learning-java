package pro.chapter23;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);

        InetAddress address2 = InetAddress.getByName("www.yandex.ru");



        //System.out.println(address2);

        InetAddress[] allByName = InetAddress.getAllByName("whois.internic.net");

        Arrays.stream(allByName).forEach(System.out::println);

    }
}
