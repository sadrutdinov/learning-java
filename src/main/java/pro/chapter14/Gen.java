package pro.chapter14;

public class Gen<Type> {
    Type ob;

    Gen(Type ob) {
        this.ob = ob;
    }

    Type getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Типом T является " + ob.getClass().getName());
    }
}

class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;

        iOb = new Gen<>(88);

        iOb.showType();

        int v = iOb.getOb();

        System.out.println(v);

        Gen<String> stringGen = new Gen<>("srting");

        stringGen.showType();
        String test = stringGen.getOb();
        System.out.println(test);

        System.out.println();
    }
}
