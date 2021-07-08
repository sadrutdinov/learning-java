package pro.chapter9;

public interface SharedConstants {
    int NO = 0;
    int YES = 1;

    default String getString() {
        return "";
    }

    default void print() {
        System.out.println("печатаю");
    }
}
