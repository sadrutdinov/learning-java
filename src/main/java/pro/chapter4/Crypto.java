package pro.chapter4;

public class Crypto {
    public static void main(String[] args) {
        String msg = "Привет мир!";
        byte key = 101;

        System.out.println(msg);

        char[] str = msg.toCharArray();

        for (int i = 0; i < str.length; i++) {
            str[i] ^= key;
        }

        msg = new String(str);

        System.out.println(msg);

        char[] str2 = msg.toCharArray();

        for (int i = 0; i < str2.length; i++) {
            str2[i] ^= key;
        }

        msg = new String(str2);

        System.out.println(msg);
    }
}
