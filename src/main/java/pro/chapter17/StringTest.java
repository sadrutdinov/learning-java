package pro.chapter17;

public class StringTest {
    public static void main(String[] args) {


        StringBuilder stringBuilder = new StringBuilder("text");


        char[] chars = {'a', 'y', 'd', 'a', 'r'};
        String s = new String(stringBuilder);

        System.out.println(s);


        String text = "четыре : " + (2 + 2);
        System.out.println(text);

        Box box = new Box("коробка", 10, 10);

        System.out.println(box);

        System.out.println(text.charAt(0));
    }
}

class Box {

    private String name;
    private int weight;
    private int height;

    public Box(String name, int weight, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Box{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
