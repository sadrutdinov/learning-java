package pro.chapter4;

public class Transit {
    public static void main(String[] args) {
        int x = 160;              // 10100000
        System.out.println(x);
        x = x >> 1;               // 01010000
        System.out.println(x);
        Integer.toBinaryString(x);
        x = x << 1;               // 10100000
        System.out.println(x);
    }
}
