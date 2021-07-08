package pro.chapter10;

public class MyException extends Exception{
    private int detail;

    public MyException(int detail) {
        this.detail = detail;
    }

    public String toString() {
        return "MyException[" + detail + "]";
    }
}
