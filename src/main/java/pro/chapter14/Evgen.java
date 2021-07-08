package pro.chapter14;

/** мостовые методы **/

public class Evgen<T>{

    public T getOb() {
        return ob;
    }

    T ob;

    public Evgen(T ob) {
        this.ob = ob;
    }
}



class BridgeDemo {
    public static void main(String[] args) {
        Evgen2 strOb2 = new Evgen2("ест обощений");

        System.out.println(strOb2.getOb());
    }
}