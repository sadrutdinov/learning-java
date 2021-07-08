package pro.chapter17;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello world");

        System.out.println(sb.length());
        System.out.println(sb.capacity());

        System.out.println(sb);
        sb.setLength(3);
        System.out.println(sb);
    }
}
