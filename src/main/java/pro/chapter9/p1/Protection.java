package pro.chapter9.p1;

public class Protection {
    int n = 1;
    private int privateN = 2;
    protected int protectedN = 3;
    public int publicN = 4;

    public Protection() {
        System.out.println("конструктор базового класса");
        System.out.println("n = " + n);
        System.out.println("privateN = " + privateN);
        System.out.println("protectedN = " + protectedN);
        System.out.println("publicN = " + publicN);

    }
}
