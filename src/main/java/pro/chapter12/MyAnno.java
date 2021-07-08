package pro.chapter12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String str() default "Тестирование";

    int val() default 9000;
}

class Meta {
    @MyAnno(str = "Пример аннотации", val = 100)
    public static void myMeth(String str, int i) {
        Meta ob = new Meta();

        // получить аннотацимю из метода и выевсти значение ее членов
        try {
            // сначала получить объект типа Class, предоставляющий данный класс
            Class<?> c = ob.getClass();
            System.out.println(c);

            // Получаем объект типа Метод, представляющий данный метод
            Method m = c.getMethod("myMeth", String.class, int.class);
            System.out.println(m);

            // получаем аннотацию данного класса
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno);

            // вывести значение членов аннотации
            System.out.println(anno.str() + " " + anno.val());

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        myMeth("ntcn", 1);
    }
}
