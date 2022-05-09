package lessons.lessons_1_to_7;

public class lesson2 {

    public static void main(String[] args) {

        int a = 5;
        int b = 13;
        int c = 113;
        int d = - 5;
        int sumab = a + b;
        int sumABC = a + b + c;
        int subBA = b - a;
        int multAB = a * b;
        int devBA = b / a;

        System.out.println("a =   " + a);
        System.out.println("b =  " + b);
        System.out.println("c = " + c);
        //Арифметическое сложение и Конкатенация
        System.out.println("сумма переменных a и b" + " " + ( a +  + b));
        System.out.println("сумма переменных a и b" + " " + sumab);
        System.out.println(a + b);
        System.out.println(sumab);
        System.out.println(sumABC);

        System.out.println(a + b + " " + c);
        //Конкатенация
        System.out.println("" + a + b + c);
        System.out.println("" + a + " "+ b + " " + c);

        System.out.print(a);
        System.out.print(b);
        System.out.println(c);

        System.out.print("Сегодня ");
        System.out.println("Суббота");
        //Арифметическое вычитание
        System.out.println(b - a);
        System.out.println(subBA);

        System.out.println(d);
        System.out.println(a - d);
        System.out.println(a + b);
        System.out.println("Он сказал \"Поехали!\" и махнул рукой.");
        System.out.println("Сегодня суббота");
        System.out.println("Сегодня\n суббота");
        System.out.println("Сегоднясуббота");
        System.out.println("Сегодня\t\t суббота\t");

        System.out.println(multAB);

        System.out.println(devBA);

        //Остаток от деления

        System.out.println(a % b);
        System.out.println(b % a);





    }







}
