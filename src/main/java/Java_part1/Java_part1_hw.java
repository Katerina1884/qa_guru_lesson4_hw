package Java_part1;

public class Java_part1_hw {
    public static void main(String[] args) {
        // переполнение и выведение в консоль
        // byte - от -128 до 127, 8разрядное целое число, используется при экономии памяти
        byte varByteA = 127;
        byte varByteB = 17;
        System.out.println(varByteA + varByteB);
        System.out.println((varByteB - varByteA) * 3);
        System.out.println(varByteA + varByteA);
        System.out.println(varByteB - varByteA * 2);

        // short - от -32 768 до 32 767, 16разрядное целое число
        short varShort = -32767;
        System.out.println(varShort - 10);
        System.out.println(varShort * 3);
        System.out.println(varShort + 500999);

        // int - от  -2^31 до 2^31-1, 32разрядное целое число, используется чаще всего
        int varIntegerA = 2147483646;
        int varIntegerB = - 55;
        System.out.println(varIntegerA * 2);
        System.out.println(varIntegerA + varIntegerB);
        System.out.println(varIntegerA * (varIntegerB / -5));

        // long - от -2^63 до 2^63-1, 64разрядное целое число, используется когда нужен более широкий диапазон чем int
        long varLong = 1000L;

        // float - с плавающей точкой, 32 бита
        float varFloat = 1999.99f;

        // double - с плавающей точкой, 64 бита
        double varDouble = 18999.99d;

        // boolean - логический, по умолчанию false
        boolean varBoolean = true;

        // char - 1 16разрядный символ Юникода, от 0 до 65535
        char varChar = 'A';

        System.out.println(varByteA * varIntegerA);
        System.out.println(Integer.MAX_VALUE * varLong);
        System.out.println(varBoolean && false);
        System.out.println(varShort - varLong);
        System.out.println(varFloat / varDouble);
        System.out.println(varChar - 'A');

        // вычисление комбинаций типов данных (int и double)
        System.out.println(varDouble - varIntegerA);
        System.out.println(varDouble * varIntegerA);
        System.out.println(varDouble + varIntegerA);
        System.out.println(varDouble / varIntegerA);
    }
}
