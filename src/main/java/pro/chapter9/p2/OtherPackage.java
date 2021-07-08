package pro.chapter9.p2;

import pro.chapter9.p1.Protection;

public class OtherPackage {

    OtherPackage() {
        Protection p = new Protection();
        System.out.println("конструктор из другого пакета");
        //System.out.println("n = " + p.n);
        //System.out.println("privateN = " + p.privateN);
        //System.out.println("protectedN = " + p.protectedN);
        System.out.println("publicN = " + p.publicN);
    }


}
