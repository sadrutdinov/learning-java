package pro.chapter20;

import java.util.Scanner;

public class AvgNums {
    public static void main(String[] args) {
        Scanner conin = new Scanner(System.in);

        int count = 0;
        double sum = 0.0;

        System.out.println("Введите числа для подсчета среднего");

        // читать и суммировть числовые значения
        while (conin.hasNext()) {
            if(conin.hasNextDouble()) {
                sum += conin.nextDouble();
                count++;
                System.out.println(sum);
            }
            else {
                String str = conin.next();
                if (str.equals("готово")) {
                    break;
                }
                else {
                    System.out.println("ошибка формата данных");
                    return;
                }
            }

        }

        conin.close();
        System.out.println("среднее равно " + sum/count );
    }
}
