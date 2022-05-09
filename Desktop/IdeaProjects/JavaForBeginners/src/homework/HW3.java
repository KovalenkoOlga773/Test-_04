package homework;

import java.sql.SQLOutput;

public class HW3 {
    public static <HexFormat> void main(String[] args) {
        String line = "____________________________________________________";
        String line1 = " ___________________________";
        String trait = " | ";

        /**Task 2
         * Создать переменные a и b типа byte, присвоить им значения
         * из допустимого диапазона.
         */
        byte a = 100;
        byte b = -128;


        /** Task 3.
         * Создать переменные s и t типа short, присвоить им негативное и
         * позитивное значения с разницей 60000.
         */
        System.out.println(line);
        System.out.println("Task 3");
        //от -32768 до 32767
        short s = Short.MAX_VALUE;
        short k = Short.MAX_VALUE - 60000;
        System.out.println(k);

        /** Task 4.
         * 4.	Создать переменную i типа int и присвоить ей минимально возможное
         * значение этого типа. Затем присвоить максимально возможное значение этого типа.
         * Распечатать оба значения в виде таблицы:
         * int min	значение i
         * int max	значение i
         */
        //от -2147483648 до 2147483647
        System.out.println(line);
        System.out.println("Task 4");

        int i_min = Integer.MIN_VALUE;
        int i_max = Integer.MAX_VALUE;

        System.out.println(line1);
        System.out.println(trait + "int min  " + trait + i_min + trait);
        System.out.println(line1);
        System.out.println(trait + "int max  " + trait + i_max + trait);
        System.out.println(line1);
        System.out.println(line);

        /** Task 5.
         * Создать переменную phoneNumber и присвоить ей значение номера
         * телефона с кодом страны и города (можно ненастоящий номер телефона,
         * например, 18009998877)
         */
        System.out.println("Task 5");
        long t = 89652851090L;
        System.out.println(t);
        System.out.println(line);

        /** Task 6
         * Создать переменную f типа float и присвоить ей значение 100.101101.
         * Создать переменную d типа double и присвоить ей значение 1000.101101.
         *                 Распечатать результат в виде таблицы:
         */
        System.out.println("Task 6");
        float f = 100.101101f;
        double d = 100.101101;

        System.out.println (trait + "float f = 100.101101" + trait + f + trait);
        System.out.println(trait + "double d = 100.101101" + trait + d + trait);
        System.out.println(line);

        /** Task 7
         * Создать переменную типа Double с именем dd  и инициализировать
         * её результатом суммы чисел 10.09999 и 20.099999.
         * b) Создать переменную типа Float с именем ff  и инициализировать её
         * результатом суммы чисел 10.09999 и 20.099999.
         */
        System.out.println("Task 7");
        double dd = 10.09999 + 20.099999;
        float ff = 10.09999f + 20.099999f;

        System.out.println (trait + "Сумма чисел 10.09999 и 20.099999" + trait
                + dd + trait);
        System.out.println(trait + "Сумма чисел 10.09999 и 20.099999" + trait + ff + trait);
        System.out.println(line);

        /** Task 8
         * Создать переменную result и присвоить ей значение выражения 10 / 3
         * (с максимальной точностью)
         */
        System.out.println("Task 8");
        double result = 10.0 / 3;
        System.out.println(result);
        System.out.println(line);

        /** Task 9
         * Создать переменные sum, product, quotient и reminder, и  присвоить
         * им значения вычислений переменных f и d
         */
        System.out.println("Task 9");
        double sum = f + d;
        double product = f * d;
        double quotient = f / d;
        double reminder = f % d;
        System.out.println(sum + ", " + product + ", " + quotient + ", " + reminder);


        /** Task 10
         * Распечатать слово HELLO точками
         */
        System.out.println("Task 10");

        System.out.println(".  . ... .   .   ....");
        System.out.println(".... ... .   .   .  ." );
        System.out.println(".  . ... ... ... ...." );


        /** Task 13
         * 13.	Создать 2 переменные референсного типа Integer - num1 и num2,
         * присвоить им одинаковые значения, сравнить 2 переменные друг с другом
         * с помощью метода .equal. Вывести результат сравнения на печать в виде выражения:
         * “Если num1 = num2, то результат сравнения методом .equal = …”
         *
         * Присвоить переменным разные значения, сравнить,  и вывести результат на печать:
         * “Если num1 не равно num2, то результат сравнения методом .equal = …”
         */
         Integer num1 = 69;
         Integer num2 = 69;
         String pe4at1 = "Если num1 + num2, то результат сравнения";
         String pe4at2 = " методом .equal = ";
         String pe4at = pe4at1 + pe4at2;

         System.out.println(pe4at + num1.equals(num2) + " . ");

        /**
         * 19.	Создать переменные:
         * String str1 = "123.56";
         * String str2 = "123.55";
         * Double doub1 = 123.56;
         * Double doub2 = 123.55;
         *
         * Распечатать результат doub1 - doub2
         *
         * Используя методы ссылочного типа данных, посчитать и распечатать результат str1 - str2
         */
        System.out.println("Task19");
        String str1 = "123.56";
        String str2 = "123.55";
        Double doub1 = 123.56;
        Double doub2 = 123.55;

        System.out.println(doub1 - doub2);
        System.out.println(Double.parseDouble(str1) - Double.parseDouble(str2));
        System.out.println(Double.valueOf(str1) - Double.valueOf(str2));

        /**
         * 20.	Создать переменную подходящего типа данных для хранения результатов
         * измерения температуры тела кота (значения температуры в Цельсиях).
         * Присвоить этой переменной сначала максимальное значение, затем минимальное значение.
         * Посчитать и распечатать среднее значение, округленное с помощью метода класса Math.
         * Распечатать результат среднего значения температуры тела кота.
         */
        System.out.println("Task20");
        Float temp;
        temp = 37.3F;
        Float average;
        average = temp / 2;
        temp = 35.6F;
        average = average + temp / 2;
        System.out.println("Среднее значение температуры тела кота - " + Math.round(average));
    }
        }

