package pro.chapter19;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class MyComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }

}

class CompDemo {
    public static void main(String[] args) {
        MyComp mc = new MyComp();
        //Comparator<String> mc2 = ;
        TreeSet<String> ts = new TreeSet<String>(Comparator.reverseOrder());


        ts.add("A");
        ts.add("C");
        ts.add("D");
        ts.add("E");
        ts.add("F");
        ts.add("G");
        ts.add("X");



        ts.forEach(p-> System.out.print(p + " "));






    }
}
