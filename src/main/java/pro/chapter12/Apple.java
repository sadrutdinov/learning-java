package pro.chapter12;

import java.util.Arrays;

public enum Apple {
    Jonathan(11),
    GoldenDel(2),
    RedDel(3),
    Winesap(2),
    Cortland(2);

    private int price;

    public static String season = "sasa";

    Apple(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

class EnumDemo {
    public static void main(String[] args) {
        Apple ap;

        for (Apple a: Apple.values()
             ) {
            System.out.println("Сорт: " + a + ", цена: " + a.getPrice());
        }

        System.out.println(Apple.season);



    }
}
