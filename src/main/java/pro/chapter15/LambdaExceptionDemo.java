package pro.chapter15;

/**
 * сгенерировать исключение из лямбда выражения
 **/

interface DoubleNumericArrayFunc {
    double func(double[] n) throws EmptyArrayException;
}

class EmptyArrayException extends Exception {
    EmptyArrayException() {
        super("Массив Пуст");
    }
}

public class LambdaExceptionDemo {
    public static void main(String[] args) throws EmptyArrayException {
        double[] values = {1, 2, 3, 4, 5};

        DoubleNumericArrayFunc doubleNumericArrayFunc = (array) -> {
            double sum = 0;

            if (array.length == 0) {
                throw new EmptyArrayException();
            }

            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }

            return sum / array.length;
        };

        System.out.println(doubleNumericArrayFunc.func(new double[0]));


    }


}
