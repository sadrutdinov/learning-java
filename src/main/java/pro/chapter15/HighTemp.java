package pro.chapter15;

/** использовать ссылку на метод экзамепляра вместе с разными объектами **/


interface MyFunc<T> {
    boolean func(T v1, T v2);

}


public class HighTemp {
    private int hTemp;

    public HighTemp(int hTemp) {
        this.hTemp = hTemp;
    }

    // если равно
    boolean sameTemp(HighTemp highTemp) {
        return hTemp == highTemp.hTemp;
    }

    // если ниже
    boolean lessThanTemp(HighTemp highTemp) {
        return hTemp < highTemp.hTemp;
    }
}

class InstanceMethWithObjectRefDemo {
    static <T> int counter(T[] vals, MyFunc<T> f, T v) {
        int count = 0;

        for (int i = 0; i < vals.length; i++) {
            if(f.func(vals[i], v)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int count;

        HighTemp[] weekDayHighs = {
                new HighTemp(89),
                new HighTemp(82),
                new HighTemp(90),
                new HighTemp(89),
                new HighTemp(89),
                new HighTemp(91),
                new HighTemp(84),
                new HighTemp(83)
        };

        count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));
        System.out.println(count);
    }

}
