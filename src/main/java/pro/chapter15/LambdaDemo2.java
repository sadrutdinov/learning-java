package pro.chapter15;


interface NumericTest {
    boolean test(int n);
}

interface NumericTest2 {
    boolean test(int n, int x);
}

public class LambdaDemo2 {
    public static void main(String[] args) {
        NumericTest isEven = (n) -> (n % 2) == 0;

        if (isEven.test(10)) {
            System.out.println("число 10 четное");
        }
        if (!isEven.test(9)) {
            System.out.println("число 9 нечетное");
        }

        NumericTest isNonNeg = n -> n >= 0;


        NumericTest2 isFactor = (n, x) -> (n % x) == 0;

        System.out.println(isNonNeg.test(-1));

        System.out.println(isFactor.test(10 ,2));
    }
}
