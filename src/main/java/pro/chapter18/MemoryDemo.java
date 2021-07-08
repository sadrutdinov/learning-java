package pro.chapter18;

public class MemoryDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        long mem1, mem2;
        Integer[] someints= new Integer[1000];

        System.out.println("всего памяти " + r.totalMemory());
        mem1 = r.freeMemory();

        System.out.println("свободной помяти исходно: "  + mem1);
        r.gc();
        mem1 = r.freeMemory();
        System.out.println("свободной памяти после очистки: " + mem1 );

        for (int i = 0; i < 1000; i++) {
            someints[i] = i;
        }

        mem2 = r.freeMemory();

        System.out.println("свободной памяти после выделениея: " + mem2);

        System.out.println("использовано памяти для выделения: " + (mem1-mem2));

        for (int i = 0; i < 1000; i++) {
            someints[i] = null;
        }
        r.gc();

        mem2 = r.freeMemory();

        System.out.println("свободной памяти псоел очистки свободных объектов типа integer: " + mem2);
    }
}
