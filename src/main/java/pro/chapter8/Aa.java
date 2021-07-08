package pro.chapter8;

public class Aa {
    int i, j;

    Aa (int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i and j: " + i +" " + j);
    }
}


class Bb extends Aa {
    int k;

    Bb (int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show(String msg) {
        System.out.println(msg + k);
    }

}

class Override {
    public static void main(String[] args) {
        Bb subOb = new Bb(1, 2, 3);

        subOb.show("k:");
        subOb.show();
    }
}
