package pro.chapter14;

public class BoundedWildCard {
    static void showXY (Coords<?> c) {
        System.out.println("координаты X Y: ");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
        }
    }
    static void showXYZ (Coords<? extends ThreeD> c) {
        System.out.println("координаты X Y Z: ");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);
        }
    }

    static void showAll (Coords<? extends FourD> c) {
        System.out.println("координаты X Y Z T: ");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x
                    + " " + c.coords[i].y
                    + " " + c.coords[i].z
                    + " " + c.coords[i].t);
        }
    }

    public static void main(String[] args) {
        ThreeD td[] = {
            new ThreeD(0, 1, 2),
            new ThreeD(9, 7, 2),
            new ThreeD(23, 13, 2),
            new ThreeD(0, 12, 2),
        };

        Coords<ThreeD> tdlocs = new Coords<>(td);

        showXY(tdlocs);
        showXYZ(tdlocs);
        //showAll(tdlocs);
    }
}
