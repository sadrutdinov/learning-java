package pro.chapter9.iface;

public interface IntStack {
    void push(int item);

    int pop();

    default void clear() {
        throw new UnsupportedOperationException();
    }

    static int getDefaultNumber() {
        return 0;
    }


}


