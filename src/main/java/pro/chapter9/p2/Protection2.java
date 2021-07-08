package pro.chapter9.p2;


import pro.chapter9.p1.Protection;

public class Protection2 extends Protection {
    Protection2() {
        System.out.println("конструктор наследованный из другого пакета");
        // System.out.println("n = " + n);
        // System.out.println("privateN = " + privateN);
        System.out.println("protectedN = " + protectedN);
        System.out.println("publicN = " + publicN);
    }

}
