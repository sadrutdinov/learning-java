package pro.chapter21;

import java.io.File;
import java.util.stream.Stream;

public class DirList {
    public static void main(String[] args) {
        String dirname = "src/main/resources";

        File f1 = new File(dirname);

        System.out.println(f1.isDirectory() ? "это директория" : "это не директория");

        if (f1.isDirectory()) {
            String[] files = f1.list();

            Stream.of(files).forEach(file -> System.out.println(file + " : " + (new File(dirname + "/" + file).isDirectory() ? "это директория" : "это файл")));
        }

        boolean x = f1.mkdir();
        System.out.println(x);
    }
}
