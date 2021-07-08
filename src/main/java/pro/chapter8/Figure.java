package pro.chapter8;

abstract class Figure {
    double dim1;
    double dim2;

    public Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract double area();
}

class Rectangle extends Figure {

    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    double area() {
        System.out.println("в области четырехугольника");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {

    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    double area() {
        System.out.println("в области треугольника");
        return dim1 * dim2 / 2;
    }
}

class FindAreas {
    public static void main(String[] args) {
       // Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);

        Figure figure;

        figure = r;
        System.out.println(figure.area());

        figure = t;
        System.out.println(figure.area());



        System.out.println()
        ;
    }
}
