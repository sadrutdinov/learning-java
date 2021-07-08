package pro.chapter17;

public class InsertDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("мне Java");

        sb.insert(4, "нравится ");

        System.out.println(sb);
    }
}
