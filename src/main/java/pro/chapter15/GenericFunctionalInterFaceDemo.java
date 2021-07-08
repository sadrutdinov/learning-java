package pro.chapter15;

/** лямбда выражение с параметром **/

interface SomeFunc<T> {
    T func(T t);
}


public class GenericFunctionalInterFaceDemo {
    public static void main(String[] args) {
        SomeFunc<String> reverse = (str) -> {
            String reverseStr = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                reverseStr += str.charAt(i);
            }

            return reverseStr;
        };

        System.out.println(reverse.func("hello"));


        SomeFunc<Integer> factorial = (n) -> {
            int result = 1;

            for (int i = 1; i <= n; i++)
                result = result * i;


            return result;
        };

        System.out.println(factorial.func(5));
    }
}
