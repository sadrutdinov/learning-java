package pro.chapter12;

public class EnumDemo4 {


    public static void main(String[] args) {
        Apple ap, ap2, ap3;

        // ordinal()
        System.out.println("все константы сортов яблок и их порядковое значение");

        for (Apple a: Apple.values()
             ) {
            System.out.println(a + " " + a.ordinal());
        }

        ap = Apple.RedDel;
        ap2 = Apple.GoldenDel;
        ap3 = Apple.RedDel;

        System.out.println();

        //compareTo
        System.out.println(Apple.Cortland.compareTo(Apple.Jonathan));

        //equals
        System.out.println(ap.equals(ap2));
    }
}
