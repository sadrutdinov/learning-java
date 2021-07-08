package pro.chapter12;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
public @interface What {
    String description();
}

@What(description = "аннтотация тестового класса")
@MyAnno(str = "Meta2", val = 99)
class Meta2 {

    @What(description = "аннтотация переменной")
    @MyAnno(str = "Meta2", val = 1)
    int x = 1;


    @What(description = "аннтотация тестового метода")
    @MyAnno(str = "Testing", val = 100)
    public static void myMeth() {
        Meta2 ob = new Meta2();

        try {
            // достаем аннотации для класса
            Annotation annos[] = ob.getClass().getAnnotations();


            System.out.println("Класс:");
            for (Annotation a: annos
                 ) {
                System.out.println(a);
            }

            //достаем аннотации для метода
            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();


            System.out.println("метод");
            for (Annotation a: annos
            ) {
                System.out.println(a);
            }

            Field f = ob.getClass().getDeclaredField("x");
            annos = f.getAnnotations();

            System.out.println("поле x:");
            for (Annotation a: annos
            ) {
                System.out.println(a);
            }


        } catch (NoSuchMethodException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        myMeth();
    }

}
