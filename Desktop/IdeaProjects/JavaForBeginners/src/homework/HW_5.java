package homework;

public class HW_5 {
    public static void main(String[] args) {
        System.out.println("Task # 2");
        System.out.println(Day_of_Week(1));

        System.out.println("Task # 3");
        Largest_number(5, 15, 56);

        System.out.println("Task # 4");
        Smallest_value(5, 6, 15);

        System.out.println("Task 5");
        System.out.println(AverageOfCats(34, 55, 13, 15, 452));

        System.out.println("Task 6");
        printRubles_Kop(10.52);

        System.out.println("task 7");
        printKg_g(15);

        System.out.println("Task 8");
        purchase(15, 8);

        System.out.println("Task 9");

        System.out.println("Task 10");
        System.out.println(count_salary(19.5, 25));

        System.out.println("Task 11");

        System.out.println("Task 12");
        System.out.println(checkX(1999));

        System.out.println("Task 13");

        System.out.println("task 14");
        System.out.println(average2(15, 25, 10));

        System.out.println("Task 15");
        System.out.println(customer(15));


    }

// Task # 1 ВСЕ!!! результаты должны быть протестированы, для этого необходимо создать
// метод с названием verifyEquals(expectedResult, actualResult)

    public static void verifyEquals(String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {
            System.out.println("pass");
        } else {
            System.out.println("fail");

        }
    }

    public static void verifyEquals(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("pass");
        } else {
            System.out.println("fail");

        }
    }

    public static void verifyEquals(double expectedResult, double actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("pass");
        } else {
            System.out.println("fail");

        }
    }

    //Task # 2 Написать метод, который принимает на вход число от 1 до 7  и возвращает день недели.
    public static String Day_of_Week(int number) {
        if (number >= 1 && number <= 7) {
            if (number == 1) {
                return "Monday";
            } else if (number == 2) {
                return "Tuesday";

            } else if (number == 3) {
                return "Wednesday";

            } else if (number == 4) {
                return "Thursday";

            } else if (number == 5) {
                return "Friday";

            } else if (number == 6) {
                return "Saturday";

            } else if (number == 7) {
                return "Sunday";
            } else {
                //return "error";
            }
        }
        return "Error";
    }

    //Task # 3 Даны значения x, y, z. Найти самое большое значение среди них.
    public static void Largest_number(int x, int y, int z) {
        // v_1
        int max1 = Math.max(Math.max(x, y), z);

        System.out.println(max1);
// V_2
        int largest;
        if (x > y) {
            largest = x;
        } else {
            largest = y;
        }
        if (largest > z)
            System.out.println(largest);
        else {
            largest = z;
            System.out.println(largest);

        }
    }

    // Task # 4
// И спользуя If напишите фрагмент кода, который распечатает самое маленькое
// значение из переменных a, b, c
    public static void Smallest_value(int a, int b, int c) {
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        if (min < c) {
            System.out.println(min);
        } else {
            min = c;
            System.out.println(min);
        }
////v_1
//    int min1 = Math.min(Math.min(a,b), c);
//
//    System.out.println(min1);

    }

    // Task # 5 .Написать алгоритм вычисления среднего значения из 5 показателей
// температуры тела кота
    public static String AverageOfCats(double a, double b, double c, double d, double e) {
        String result = " ";
        double catMax = 40.55;
        double catMin = 35.15;
        if ((a >= catMin) && (a <= catMax) && (b >= catMin) && (b <= catMax) && (c >= catMin) && (c <= catMax) &&
                (d >= catMin) && (d <= catMax) && (e >= catMin) && (e <= catMax)) {
            double value = ((a + b + c + d + e) / 5);
            result = String.format("%.2f", value);
        } else {
            result = "error";
        }
        return result;
    }

    //Task # 6 Написать метод, который принимает на вход десятичное число (например, 10.75),
// и возвращает строку “10 руб 75 коп”.
    public static void printRubles_Kop(double a) {
        int rub = (int) a;
        double kop = a * 100 - rub * 100;
        int kop1 = (int) kop;
        System.out.println(rub + " руб." + kop1 + " коп. ");
    }

    // Task 7 Написать метод, который принимает на вход десятичное число и
// возвращает строку “10 кг 75 гр”.
    public static void printKg_g(double v) {
        int kg = (int) v;
        double g = v - kg;
        double g1 = g * 1000;
        int g2 = (int) g1;
        System.out.println(kg + " кг. " + g2 + " гр. ");
    }

    //Task 8.	Написать метод, который принимает на вход 2 параметра -  цену и количество товара (может быть вес товара, или количество в штуках). Алгоритм возвращает сумму покупки
// в виде десятичного числа.
    public static void purchase(double price, double weight) {
        double count = price * weight;
        System.out.println(String.format("%.2f", count));
    }

//9.	Написать метод, который принимает на вход необходимые параметры, и печатает чек.
//Например:
//
//Яблоки
//Цена за 1 кг			50 руб 13 коп
//Количество товара	3 кг 400 гр
//_______________________________________
//Сумма к оплате		170 руб 44 коп
//
//или
//
//Хлеб
//Цена за 1 шт		30 руб 50 коп
//Количество товара	5 шт
//_______________________________________
//Сумма к оплате		152 руб 50 коп

//public static String printCheque(String product, double price, double quantity, String measure) {
//         measure = " ";
//        System.out.println(product);
//    System.out.println("Price for 1 " +  measure + "\t\t" + printRubles_Kop(price));
//    System.out.println("Quantity\t\t\t" + printKg_g(quantity));
//    System.out.println("Total\t\t\t\t" + printRubles_Kop(price * quantity ));
//}

//Task 10 Написать метод, который принимает на вход количество часов работы в день
// и стоимость одного часа работы, и возвращает заработную плату в месяц.

    public static String count_salary(double worksDayHours, double priceOneHour) {
        int salary = ((int) (worksDayHours * priceOneHour * 21));
        double salary1 = ((worksDayHours * priceOneHour * 21));
        int realsalaru = (int) salary;
        int coins = (int) ((salary1 - salary) * 100);
        return (salary + " руб " + coins + " коп");

    }
//    Task 11
//	Написать метод, который принимает на вход необходимые параметры и печатает
//    строку ведомости выдачи зарплаты сотрудникам.
//    Например:
//
//    Смирнова Мария Ивановна 		70000 руб 00 коп
//
//    Распечатать ведомость для нескольких сотрудников, например:
//
//    Март 2022
//    Смирнова Мария Ивановна 		70000 руб 00 коп
//    Серебряков Иван Петрович 		128059 руб 00 коп

    // Task 12
// Записать в виде метода:
    public static String checkX(int x) {
        if (x < 0) {
            return x + " is negative";

        } else if (x > 0) {
            return x + " is positive";
        } else {
            return x + " is zero";
        }
//Task 13
//13.	Написать метод, который принимает на вход год рождения и возвращает
//    ваше счастливое число. Счастливое число рассчитывается по формуле: сумма
//    всех чисел, если результат больше 9, снова считается сумма всех чисел.
//Например:
//год рождения 1999
//1 + 9 + 9 + 9 = 28
//2 + 8 = 10
//1 + 0 = 1
//    Счастливое число - 1
// public static Integer lucky_Number (int year) {
//            int n1 = year / 1000;
//            int n2 = (year % 1000) / 100;
//            int n3 = (year % 100) / 10;
//            int n4 = (year % 10);
//            int luckyNum = n1 + n2 + n3 + n4;
//            while (luckyNum >= 10) {
//                n1 = luckyNum / 10;
//                n2 = luckyNum % 10;
//                luckyNum = n1 + n2;
//
//            }
//            return luckyNum;
//    }

    }
// Task # 14
// а) Дано 3 числа. Необходимо рассчитать разницу между средним значением и медианой (median) значением.
// Если разница больше 2, необходимо показать сообщение: “Среднее значение … отличается от медианы … на … “.
//Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.
//
//b) Посчитать все то же самое с помощью методов класса Math, где возможно их использовать

    public static String average2(int a, int b, int c) {
        int average = (a + b + c) / 3;
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        int median = a + b + c - (min + max);
        String result;

        int diff = average - median;
        Math.abs(diff);

        if (diff > 2) {
            result = "Среднее значение" + average + " отличается от медианы " + median +
                    "на" + diff;
        } else {
            result = "Среднее значение = " + average + " медиана = " + median +
                    " .";
        }
        return result;
    }

    // Task 15
//Написать метод, который использует методы класса Math, принимает на вход сумму
// к оплате (например, 10.75) и округляет сумму в пользу покупателя. Метод возвращает
// новую сумму к оплате в виде строки, например “10 руб 00 коп”.
    public static String customer(double a) {
        int b = (int) Math.floor(a);
        String sum = b + " руб " + (b / 100) + "0" + " коп";
        return sum;
    }

    // Task 16
//  	Посчитать с помощью методов класса Math
//a = 3
//b = 4
//c = 20
//
//√(((a * b + c) * a^b))/(π )
//Вернуть значение с округлением в бОльшую сторону.
    public static double task16(int a, int b, int c) {
        double res = (Math.sqrt((Math.fma(a, b, c)) * Math.pow(a, b)) / Math.PI);
        return Math.ceil(res);
    }

// 17.1
    public static int Task17_1(int y) {
        int x;
        if (y > 0) {
            x = 1;
        } else {
            return y;
        }
        return y;
    }

   public static void Task17_2(double c) {
         if (c >= 80 && c <= 90) {
             System.out.println(c + 5);
         } else {
             System.out.println("score less than 80 or more than 90");
         }

         }
    public static boolean Task17_3(int i, int v) {
        boolean t = (i > 10) && (v < 50);
        return t;

    }

    public static boolean Task17_4(int x) {
        boolean a = (x > 0) && (x % 2 == 0);
        return a;
    }

   // }
// Task 18
//Написать метод, который с помощью методов класса Math высчитывает любую
//    степень сгенерированного случайного числа. Метод возвращает математически
//    округленное целое значение и выводит на экран:
//            “Число … в степени … = …”

//    public static String task18(double a, int b) {
//        String text;
//        if (a >= 0 && a <= 1) {
//            if (b >= 0 && b <= 10) {
//                text = "Чмсло " + a + " в степени " + b + " = " +
//                        Math.pow(a, b);
//                 return text;
//            }
//
//        }
//        return null;
//    }

    public static double task18(int o) {
//        String message;
//        double c = Math.random();
//        int s = (int) (Math.random() * 11);
//         double p = Math.pow(c, s);
//         int res = (int) Math.round(p);
//         message = "Число" + с + "в степени" + s + " = " + res;
//         return message;
        if(o >= 0 && o <= 10) {
           return Math.pow(Math.random(), o * 1.0);
        } else {
            System.out.println("Error");
            return Double.MIN_VALUE;
        }

    }
// task 19
// Написать метод, который возвращает случайное число в пределах от 1 до 99 включительно.
    public static int Task_19(int num1) {
         num1 = (int) (Math.random() * 99) + 1;
         return num1;

    }
// Task 20
 public  static boolean isLeapYear(int year) {
        boolean isLeapYear = (year % 100 == 0 && year % 400 == 0 || year % 4 == 0 && year % 100 > 0);
        return isLeapYear;
 }


}






