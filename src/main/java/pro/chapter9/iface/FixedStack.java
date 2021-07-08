package pro.chapter9.iface;

public class FixedStack {

    private int[] stck;
    private int tos;

    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }


}
