package pro.chapter21;

import java.io.File;

public class FileDemo {


    static void p(String s) {
        System.out.println(s);
    }
    public static void main(String[] args) {
        File f1 = new File("src/main/resources/COPYRIGHT.txt");
        p(f1.getName());
        p(f1.getPath());
        p(f1.getAbsolutePath());
        p("родительский каталог: " + f1.getParent());

        p(f1.exists() ? "существует" : "не существует");

        p(f1.canWrite() ? "доступен для записи" : "не доступ для записи");

        p(f1.canRead() ? "доступен для чтения" : "не дотсупен для чтения");


        p("" + f1.lastModified());
        p("size: " + f1.length());


        //File f2 = new File("src/main/resources/test.txt");





    }
}
