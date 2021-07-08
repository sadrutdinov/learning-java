package pro.chapter12;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyMarker {
}

class Marker {

    //@MyMarker
    public static void myMeth() {
        Marker marker = new Marker();

        try {
            Method m = marker.getClass().getMethod("myMeth");

            if (m.isAnnotationPresent(MyMarker.class)) {
                System.out.println("маркерная аннотация MyMarker причутствует");
            }
            else {
                System.out.println("маркерная аннотация MyMarker отсутствует");
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        myMeth();
    }
}