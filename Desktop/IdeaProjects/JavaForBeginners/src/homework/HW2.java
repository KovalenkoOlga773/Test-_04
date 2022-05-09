package homework;

import java.security.spec.RSAOtherPrimeInfo;

public class HW2 {
    public static void main(String[] args) {
        /** Task 11
         * Создать целочисленные переменные k, l, m и присвоить им значения на ваше усмотрение
         */
        String line = "____________________________________________________";
        System.out.println("Task 11");
        int k = 5;
        int l = 10;
        int m = 15;

        /** Task 12
         * Вывести значения переменных в столбик
         */
        System.out.println(line);
        System.out.println("Task 12");
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(line);

        /** Task 13
         * Вывести значения переменных в строку
         */

        System.out.println("Task 13");
        System.out.println(" " + k + " " + l + " " + m);
        System.out.println(line);

        /** Task 14
         * Используя конкатенацию, вывести значения переменных в строку через запятую
         */
        System.out.println("Task 14");
        System.out.println("" + k + ", " + l + ", " + m);
        System.out.println(line);

        /**  Task 15
         * Вывести значения этих переменных так, чтобы было понятно,
         *  какое значение к какой переменной относится.
         Например, должно быть распечатано:
         int a = 5;
         или
         a = 5
         */
        System.out.println("Task 15");
        System.out.println("int k = 11;\n" +
                           "int l = 6;\n" +
                           "int m = 78;");
        System.out.println(line);

        /** Task 16
         *  Распечатать следующие выражения, где вместо … будет выведен
         *  результат арифметической операции:
         *  Sum of k and l = …
         *  k * m = …
         *  Разность переменных l и m = … */
        System.out.println("Task 16");
        System.out.println("Sum of k and l = " + k + l);
        System.out.println("k * m = " + k * m);
        System.out.println("Разность переменных l и m = " + (l - m));
        System.out.println(line);

        /** Task 17.
         * Распечатать следующие выражения:
        Результат деления k на l = …, а остаток от деления  = …
        Результат деления k на m = …, а остаток от деления  = …
        Результат деления l на m = …, а остаток от деления  = …
        Результат деления m на k = …, а остаток от деления  = …*/

        String v = " а остаток от деления = ";
        String w = "Результат деления";
        System.out.println("Task 17");
        System.out.println( w + "k на l = " + k / l + "," + v + k % l);
        System.out.println( w + "k на m = " + k / m + "," + v + k % m);
        System.out.println( w + "l на m = " + l / m + "," + v + l % m);
        System.out.println( w + "m на k = " + m / k + "," + v + m % k);
        System.out.println(line);

        /** Task 18.
         * Создать переменные apple и  student и присвоить им значения 40 и 6 соотетственно.
         Распечатать выражение:
        Если … яблок поделить на … учеников, то каждый ученик получит по … яблок(a),
        и … яблок(а) останется учителю.
        Распечатать это же выражение со значениями 100 и 21*/

        int apple = 40;
        int student = 6;
        int apple1 = 100;
        int student1 = 21;

        System.out.println("Task 18");
        System.out.println("Если " + apple + " яблок поделить на " + student +
                " учеников, то каждый ученик получит по " + apple / student +  " яблок(a), и " +
               apple % student + " яблок(а) останется учителю.");
        System.out.println("Если " + apple1 + " яблок поделить на " + student1 +
                " учеников, то каждый ученик получит по " + apple1 / student1 +  " яблок(a), и " +
                apple1 % student1 + " яблок(а) останется учителю.");
        System.out.println(line);

        /**
         *  Task 19.	Распечатать вычисления и итоговый результат:
        Сумма чисел k, l, m++ и sumKLM-- = …, а разность m++ и  sumLKM = …*/
        System.out.println("Task 19");
        int sumklm = k + l + m;
        int sumlkm = l + k + m;
        int summkl = m + k + l;
        m++;
        System.out.println(sumklm);
        sumlkm++;
        System.out.println(sumlkm);
        summkl--;
        System.out.println(summkl);
        System.out.println("Сумма чисел k, l, m++ и sumKLM-- = " + (sumlkm + summkl)
        + ", a разность m++ и  sumLKM = " + (m++ - sumklm));
        System.out.println();

        System.out.println(line);


        /** Task 20
         * Показать, что число 48 кратно 8, и что оба этих числа - четные.
        А числа 47 и 49 - нечетные.*/
        System.out.println("Task 20");
        int a = 48;
        int b = 8;
        int c = 47;
        int d = 49;
        int divab = a % b;
        if (divab == 0) {
            System.out.println("число 48 кратно 8");
        }
        if (a % 2 == 0) {
            System.out.println(a + " четное ");
        }
        else {
            System.out.println(a + " нечетное");
        }
        if (b % 2 == 0) {
            System.out.println(b + "  четное ");
        }
        else {
            System.out.println(b + " нечетное");
        }
        if (c % 2 == 0) {
            System.out.println(c + " четное");
        }
        else {
            System.out.println(c + " нечетное");
        }

        if (d % 2 == 0) {
            System.out.println(d + " четное");
        }
        else {
            System.out.println(d + " нечетное");
        }
        System.out.println(line);

        /** Part 3
         * Для всех заданий:
         *
         * x = 2,   y = 3,  a = k, b = l, c = m, d = y - x
         *
         * a. Вывести на печать математическое выражение из заданий 21, 22 и 23
         * b. Посчитать значения из задания a и вывести результат на печать в виде таблицы.
         * result21, result22 и result23 - результаты вычислений в каждом выражении
         */
        int x = 2;
        int y = 3;
         a = k;
         b = l;
         c = m;
         d = y - x;
        System.out.println("Task 21");
        System.out.println("(x + 3) * (x + 3)");
        int result21 = (x + 3) * (x + 3);
        System.out.println(result21);
        System.out.println(line);

        System.out.println("Task 22");
        System.out.println("(3 + 4 * x / 5) - ((10 * (y - 5) * (a + b + c)) / x)"
                + " + (9 * (4 / x + (9 + x) / y))");
        int result22 = (3 + 4 * x / 5) - ((10 * (y - 5) * (a + b + c)) / x)
                + (9 * (4 / x + (9 + x) / y));
        System.out.println(result22);
        System.out.println(line);

        System.out.println("Task 23");
        System.out.println("(((5 * x + 7 * y / 8 * x + 10 * y)) / " +
                "((3 * x - y / (x + y)))" + "/ (a + b + c / d + (a + b) / " +
                "(c + d) + a * b");
        int result23 = (((5 * x + 7 * y / 8 * x + 10 * y)) /
        ((3 * x - y / (x + y))) / (a + b + c / d + (a + b) /
                (c + d) + a * b));
        System.out.println(result23);
        System.out.println(line);
























    }
}
