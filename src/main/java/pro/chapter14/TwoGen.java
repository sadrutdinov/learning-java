package pro.chapter14;

public class TwoGen<T, V> {
    T obT;
    V obV;

    public TwoGen(T obT, V obV) {
        this.obT = obT;
        this.obV = obV;
    }

    void showTypes() {
        System.out.println("type T: " + obT.getClass().getName());
        System.out.println("type V: " + obV.getClass().getName());
    }

    T getObT() {
        return obT;
    }
    V getObV() {
        return obV;
    }

}

class SimpleGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<>(88, "Обобщения");

        tgObj.showTypes();

        int t = tgObj.getObT();
        System.out.println("value: " + t);
        String v = tgObj.getObV();
        System.out.println("value: " + v);

    }
}
