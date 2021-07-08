package pro.chapter7;

public class CommandLine {
    public static void main(String[] args) {
        int i = 0;
        for (String str: args) {
            System.out.println(i + ": " + str);
            i++;
        }

    }
}
