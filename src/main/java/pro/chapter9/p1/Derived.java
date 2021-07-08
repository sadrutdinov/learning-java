package pro.chapter9.p1;

public class Derived extends Protection {
    Derived() {
        System.out.println("конструктор подкласса");
        System.out.println("n = " + n);
        //System.out.println("privateN = " + privateN);
        System.out.println("protectedN = " + protectedN);
        System.out.println("publicN = " + publicN);
    }
}
