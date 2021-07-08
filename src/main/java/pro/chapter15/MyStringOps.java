package pro.chapter15;
/** демонстарция ссылки на статический метод **/


interface StringFunc2 {
    String func(String n);
}

public class MyStringOps {
    String strReverse(String str) {
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;

    }
}

class MethodRefDemo {
    static String stringOp(StringFunc stringFunc, String s) {
        return stringFunc.func(s);
    }

    public static void main(String[] args) {
        String inputString = "Лямбда-выражения повыщают ээфективность java";
        String outputString;

        MyStringOps myStringOps = new MyStringOps();

        outputString = stringOp(myStringOps::strReverse, inputString);

        System.out.println(inputString);
        System.out.println(outputString);
    }
}
