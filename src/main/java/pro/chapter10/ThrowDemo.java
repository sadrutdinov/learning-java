package pro.chapter10;

public class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("исключение перехвачено в теле метода demoproc()");
            System.out.println(e);
           throw e;
        }

    }

    public static void main(String[] args) {
        demoproc();
//        try {
//            demoproc();
//        } catch (NullPointerException e) {
//            System.out.println("Потвоорный перехват: " + e);
//        }

    }
}
