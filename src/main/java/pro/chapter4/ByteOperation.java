package pro.chapter4;

public class ByteOperation {
    public static void main(String[] args) {

          //~ НЕ (инвертирование)
        // x | ~`
        // 0 | 1
        // 0 | 1
        // 1 | 0
        // 1 | 0
//        int var = 121; // двичный вид 00000000 00000000 00000000 01111001
//        int not_v = ~var;
//
//        System.out.println(Integer.toBinaryString(not_v));
//
//        System.out.println(not_v );


//        // & побитовое умножение
        // x | y | &
        // 0 | 0 | 0
        // 0 | 1 | 0
        // 1 | 0 | 0
        // 1 | 1 | 1
//        byte flags = 5; // 00000101
//        byte mask = 4;  // 00000100
//
//        int res = flags&mask; // 00000100
//
//
//        System.out.println(res);


        // побитовое сложение |
        // x | y | |
        // 0 | 0 | 0
        // 0 | 1 | 1
        // 1 | 0 | 1
        // 1 | 1 | 1
//        byte flags = 8; // 00001000
//        byte mask = 5;  // 00000101
//
//        flags = (byte) (flags | mask); //00001101
//        System.out.println(flags);


    // исключающий или (XOR)  ^
        // x | y | ^
        // 0 | 0 | 0
        // 0 | 1 | 1
        // 1 | 0 | 1
        // 1 | 1 | 0

        byte flags = 9; // 00001001
        byte mask = 1;  // 00000001

        flags = (byte)(flags ^ mask); // 00001000

        System.out.println(flags);

        flags ^=mask;
        System.out.println(flags);



    }
}
