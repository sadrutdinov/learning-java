package pro.chapter15;

/**
 * Пример захвата локальной переменной из объемлющей
 **/

interface MuFunc {
    int func(int i);
}


public class VarCapture {
    public static void main(String[] args) {
        int num = 10;

        MuFunc muFunc = n -> {
            // такое применение num допустимо так как она не видоизменяется (read/only)
            int v = num + n;
            // num++
            // а изменять эту переменную нельзя
            return v;

        };

        // num = 9;
        // это тоже ошибочно, так как лямбда должна использовать финальные перемнные,
        // т.е. не изменяющиеся в процессе исполнения (не обязательно final)
        System.out.println(muFunc.func(12));
    }
}
