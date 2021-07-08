package pro.chapter20;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> noVal = Optional.empty();
        Optional<String> hasVal = Optional.of("ABCDEFG");

        if (noVal.isPresent()) {
            System.out.println("не подлежит выводу");
        }
        else {
            System.out.println("noVal не содержит знаечние");
        }

        if (hasVal.isPresent()) {
            System.out.println("hasVal содержит следующую строку");
            System.out.println(hasVal.get());
        }
        else {
            System.out.println("hasVal не содержит знаечние");
        }

        String defStr = noVal.orElse("default string");
        System.out.println(defStr);




    }
}
