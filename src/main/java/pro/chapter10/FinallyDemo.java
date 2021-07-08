package pro.chapter10;

public class FinallyDemo {
    static void procA() {
        try {
            System.out.println("in method procA()");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("finally in method procA()");
        }
    }

    public static void main(String[] args) {
        procA();
//        try {
//            procA();
//        } catch (RuntimeException e) {
//            System.out.println("ex");
//        }
    }
}
