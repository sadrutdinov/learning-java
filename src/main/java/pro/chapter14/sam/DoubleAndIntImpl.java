package pro.chapter14.sam;



public class DoubleAndIntImpl<T extends Number> implements DoubleAndInt<T>{
    private T value;

    public DoubleAndIntImpl(T value) {
        this.value = value;
    }


    @Override
    public T getValue() {
        return value;
    }
}
