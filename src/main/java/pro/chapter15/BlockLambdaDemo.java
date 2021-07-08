package pro.chapter15;

/** лямбда выражение блочное **/

interface NumericFunc {
    int func(int n);
}

public class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFunc numericFunc = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            return result;
        };


        System.out.println(numericFunc.func(-3));
    }
}
