package pro.chapter6;

public class Box {
    double width;
    double height;
    double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxDemo3 {
    public static void main(String[] args) {
        Box box1 = new Box(10,10,10);


        System.out.println(box1.volume());
    }
}