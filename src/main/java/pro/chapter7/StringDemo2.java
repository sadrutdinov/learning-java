package pro.chapter7;

public class StringDemo2 {
    public static void main(String[] args) {
        String str1 = "строка";
        String str2 = "строк";

        System.out.println(str1.equals(str2));
        System.out.println(str1.contains(str2));
        System.out.println(str1.length());
        System.out.println(str1.charAt(4));
    }
}
