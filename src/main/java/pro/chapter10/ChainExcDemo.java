package pro.chapter10;

public class ChainExcDemo {
    static void demoproc() {
        NullPointerException e = new NullPointerException("верхний уровень");
        e.initCause(new ArithmeticException("Причина"));

        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("перехвачено исключение: "+ e);
            System.out.println("певропричина: " + e.getCause());
        }

    }
}
