package pro.chapter9.p1;

public class SamePackage {
    SamePackage () {
        Protection p = new Protection();
        System.out.println("конструктор из того же самого пакета");
        System.out.println("n = " + p.n);
        //System.out.println("privateN = " + p.privateN);
        System.out.println("protectedN = " + p.protectedN);
        System.out.println("publicN = " + p.publicN);
    }
}
