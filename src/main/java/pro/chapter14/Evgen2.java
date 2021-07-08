package pro.chapter14;

class Evgen2 extends Evgen<String> {

    public Evgen2(String ob) {
        super(ob);
    }

    public String getOb() {
        System.out.println("вызван метод String getOb(): ");
        return ob;
    }
}
