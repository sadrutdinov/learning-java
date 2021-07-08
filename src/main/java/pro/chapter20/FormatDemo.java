package pro.chapter20;

import java.util.Formatter;
import java.util.GregorianCalendar;

public class FormatDemo {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();

        String text = "средствами Java";
        int d = 10;
        float f = 98.6f;

        formatter.format("форматировать %s это просто %d %f", text, d, f);
        System.out.println(formatter);
        formatter.close();
        //128 64 32 16 8 4 2 1




        System.out.printf("форматировать %s это просто %d %f", text, d, 98.6);

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        System.out.println();

        System.out.printf("сегодня %tF", gregorianCalendar);

        System.out.println();

        for (int i = 0; i <= 10 ; i++) {
            System.out.printf("%4d %4d %4d", i, i*i, i*i*i);
            System.out.println();
        }
    }
}
