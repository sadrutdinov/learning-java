package pro.chapter20;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;

public class DateDemo {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        Date date = new Date();
        System.out.println(dateFormat.format(date));

        long msec = date.getTime();

        System.out.println("количество милисекунд прошедших с 1 января 1970 года по гринвичу = " + msec);
    }
}
