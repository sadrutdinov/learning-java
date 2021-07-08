package pro.chapter14.sam;

public class SoloDemo {

    public static void main(String[] args) {
        DoubleAndIntImpl<Integer> doubleAndInt = new DoubleAndIntImpl<>(32);
        DoubleAndIntImpl<Double> doubleAndInt2 = new DoubleAndIntImpl<>(21.7);
        System.out.println(doubleAndInt.getValue());
        System.out.println(doubleAndInt2.getValue());

    }

}
