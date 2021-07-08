package pro.chapter15;

import java.util.Locale;

/** лямбда выражение как аргумент метода **/

interface StringFunc {
    String func(String n);
}

public class LambdasAsArgumentDemo {
    static String stringOp(StringFunc stringFunc, String string) {
        return stringFunc.func(string);
    }

    public static void main(String[] args) {
        String inStr = "здравствуйте я андрей пакетов то шо это самое";
        String outString;
        System.out.println(inStr);

        outString = stringOp((str) -> str.toUpperCase(Locale.ROOT), inStr);

        System.out.println(outString);

        outString = stringOp((str)-> str.replace(" ", ""), inStr);

        System.out.println(outString);

        StringFunc reverse = (str) -> {
            String reverseStr = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                reverseStr += str.charAt(i);
            }

            return reverseStr;
        };

        outString = stringOp(reverse, inStr);

        System.out.println(outString);

    }
}
