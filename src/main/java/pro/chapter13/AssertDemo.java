package pro.chapter13;

public class AssertDemo {
    static int val = 3;

    static int getVal() {
        return val--;
    }

    public static void main(String[] args) {
        int n;

        for (int i = 0; i < 10; i++) {
            n = getVal();

            assert n > 0 : "n отрицательное"; // не подтвердится, если n == 0

            System.out.println("n = " + n);

        }
    }
}
