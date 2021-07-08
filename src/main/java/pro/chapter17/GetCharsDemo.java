package pro.chapter17;

import java.util.Locale;

public class GetCharsDemo {
    public static void main(String[] args) {
        String s = "это демонстрация метода getChars()";
        char buf[] = new char[5];
        s.getChars(4,8,buf,1);
        System.out.println(buf);

        byte[] test = s.getBytes();
        System.out.println();
        System.out.println(s.equalsIgnoreCase(s.toUpperCase(Locale.ROOT)));

        String ss = "demo demo";

        System.out.println(ss.regionMatches(0, ss, 5, 4));



    }
}
