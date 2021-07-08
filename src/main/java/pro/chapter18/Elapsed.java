package pro.chapter18;

public class Elapsed {
    public static void main(String[] args) {
        long start, end = 0;

        start = System.currentTimeMillis();

        for (long i = 0; i < 10000000 ; i++) {
            end = System.currentTimeMillis();
        }
        System.out.println(end-start);
    }
}
