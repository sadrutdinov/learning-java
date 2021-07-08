package pro.chapter20;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println("Дата: " + calendar.get(Calendar.DATE) + calendar.get(Calendar.MONTH) + calendar.get(Calendar.YEAR));



    }
}
