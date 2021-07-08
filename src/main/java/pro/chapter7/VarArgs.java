package pro.chapter7;

public class VarArgs {
    public static void main(String[] args) {
        VarArgs varArgs = new VarArgs();
        varArgs.test(1, 2, 2, 4, 5, 6, 7);
    }

    void test(int a, int b, int ... c) {
        System.out.println(a);
        System.out.println(b);
        for (int x: c
             ) {
            System.out.print(x + " ");
        }
    }
}
