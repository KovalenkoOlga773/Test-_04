package homework;

import java.sql.SQLOutput;

public class HW_6 {

    public static void main(String[] args) {

        // Task 1
// Распечатать последовательность чисел от 0 до 9 включительно.
        System.out.println( "Task # 1");
        for (int i = 1; i <= 9; i++) {
            System.out.println(i);

        }

        // Task 2
// Распечатать последовательность чисел от 10 исключительно до 0 включительно.
        System.out.println( "Task # 2");
        for (int i = 9; i >= 0; i--) {
            System.out.println(i);
        }
       // Task 3
// Распечатать последовательность чисел от 50 до 55 включительно с шагом 2.
        System.out.println("Task # 3");
        for (int i = 50; i <= 55; i++) {

            System.out.println(i);
        }

         // Task 4
//  Распечатать последовательность чисел, кратных 7, в промежутке (327, 300)
        System.out.println("Task # 4");
        for (int i = 326; i > 300; i--) {
            if(i % 7 == 0) {
                System.out.println(i);
            }

        }
        // Task 5
// Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1
        //v_1
        System.out.println("Task # 5 v_1");
        for (double i = 12; i <= 13; i += 0.1) {
            System.out.println(String.format(("%.1f"), i));

        }
        //v_2
         System.out.println("Task # 5 v_2");
        for (int i = 120; i < 131; i++) {
            System.out.println(((double) i/10) + " ");
        }

        // Task 6
// Распечатать последовательность четных чисел от 215 до 237 включительно
        System.out.println("Task # 6");
        for (int i = 215; i <= 237; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
// Task 7
//Распечатать последовательность чисел, кратных 7, в промежутке
// от 7 исключительно до 14 исключительно.
        System.out.println("Task # 7");
        for (int i = 8; i < 14; i++) {
            if(i % 7 == 0) {
                System.out.println(i);
            } else {
                System.out.println("Нет чисел кратных 7");
            }


        }

// Task 8
// Распечатать последовательность которая начинается с минимального
//  значения типа данных short и заканчивается максимальным значением short.
//  Числа в последовательности должны быть кратны 15001.
        System.out.println("Task # 8");
        Short min = Short.MIN_VALUE;
        Short max = Short.MAX_VALUE;
        for (int i = min; i <= max ; i++) {
            if(i % 15001 == 0) {
                System.out.println(i);
            }
        }



// Task 9
//Распечатать последовательность чисел в промежутке от -10 до 34 включительно.
// Числа, кратные 11, должны быть распечатаны синим цветом. Числа, кратные 12,
// должны быть распечатаны красным цветом. А ноль необходимо распечатать словом ZERO.

        System.out.println("Task # 9 v_1");
        int i, j, k;
        for (i = -10; i <= 34; i += 11) {
            System.out.println("\u001B[34m" + i);
        }
        for (j = -10; j <= 34; j += 12) {
            System.out.println("\u001B[31m" + j + "\u001b[0m");
        }
        for(k = 0;k>=0 ;k+=1) {
            System.out.println("ZERO");
            break;
        }

// v_2
        System.out.println("Task # 9 v_2");
        System.out.println("");
        for(i = -10; i <= 34; i++) {
            if(i == 0) {
                System.out.println("ZERO");
            } else if(i % 11 == 0) {
                System.out.println("\u001B[34m" + i);
            } else if(i % 12 == 0) {
                System.out.println("\u001B[31m" + i + "\u001b[0m");
            }
        }
        System.out.println("\u001b[0m");

//// Task 13
////Вывести последовательность 012345678900112233445566778899000…
// до числа 9999 включительно.

//   v_1
        System.out.println("Task # 13");
//         i, j, k;
        for (i = 0; i <= 9; i += 1) {
            System.out.print("\u001B[34m" + i);
        }
        for (j = 0;  j <= 9; j += 1) {
            System.out.print("\u001B[31m" + j + j + "\u001b[0m");
        }
        for (j = 0;  j <= 9; j += 1) {
            System.out.print("\u001B[31m" + j + j + j + j + "\u001b[0m");
        }



        System.out.println("Task 10");
        task10(5,6,1);
        task_10_v_2(-10, 1.23, -12);
        System.out.println("Task 11");
        Task_11_seq(12);
        System.out.println("Task 12");
        Task_12 (5);
        System.out.println("Task 16");
        task_16(1, 2, 5);
        System.out.println("Task 17");
        task_17(0);
        System.out.println("Task 18");
        task_18(1, 10);
        System.out.println("Task 19");
        task_19();
        System.out.println("Task 20");
        task_20(5);
    //Task 14
//Распечатайте последовательность чисел:
//0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5
        System.out.println("Task # 14");
        int f = 1;
        int b = 0;
        for(i = 1; i <=6; i++) {
            if(i == 6) {
                System.out.println(b);
            } else {
                System.out.print(b + ", " + f + ", ");
            }
            f++;
            b--;
        }
// Task # 15
// Распечатать последовательность чисел:
// 0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25
        System.out.println("Task # 15");
       for(i = 0; i <= 25; i++) {
           if(i == 0) {
               System.out.print(i + ", ");
           } else if(i % 3 == 0) {
               System.out.print(i + ", ");
           } else if (i % 5 == 0) {
               System.out.print(i + ", ");
           }
       }

    }




    //Task # 10
// Написать метод, который принимает на вход параметры start,  end, step,
// и печатает последовательность десятичных  чисел, начиная с числа start,
// с шагом step. Точка выхода из цикла - число end.
    // v_1
    public static void task10 (double start, double end, double step) {
        for (start = start; start < end; start += step) {
            System.out.println(start);

        }
    }
 // v_2

    public static void task_10_v_2 (double start, double end, double step) {
        //увеличивается start < end, step > 0,
        //уменьшается start > end, step < 0
        if (start < end && step > 0) {
            for (start = start; start < end; start += step) {
                System.out.println(start);
            }
        } else if (start > end && step < 0) {
            for (start = start; start > end; start += step) {
                System.out.println(start);
            }
        } else {
            System.out.println("Invalid data");
        }

    }

//   part 2 Task # 11
//   Написать метод, который принимает параметр ι и печатает
//   последовательность четных чисел от нуля. Длина последовательности = ι.
    public static void Task_11_seq(int l) {
        int end = 0;
        for (int i = 0; end < l; i += 2) {
            System.out.println(i);
            end++;
        }


    }
// Task 12
//Напишите метод, который принимает целое число n, и выводит
// все степени числа 2 от 1 до n включительно
public static void Task_12 (int n) {
           n =  5;
    for (int i = 1; i<= n; i++){
        System.out.println((int)Math.pow(2, i));

    }

}

    //// Task 13
////Вывести последовательность 012345678900112233445566778899000…
// до числа 9999 включительно.
    // v_2
    public static String thirteenth() {

        String result = "";
        String result2 = "";
        String result3 = "";
        String result4 = "";
        for (int i = 0; i < 10; i++) {
            result = result + i;
            result2 = result2 + i + i;
            // result3 = result3 + i + i;
            result4 = result4 + i + i + i + i;
        }
        return result + result2 + result3 + result4;
    }
    // Task # 16
// Написать метод, который принимает параметры n, m, , и печатает последовательность
// нечетных чисел начиная с числа n, с шагом m,  длина последовательности  .
    public static void task_16(int n, int m, int l) {
        for(int i = n; i <= l; i+= m) {
            if (i % 2 == 1) {
                System.out.println(i + " ");
            }
        }
    }
// Task # 17
//Сгенерируйте и распечатайте последовательность по формуле:
//    n + 1 = n + 2
 public static void task_17(int n) {
        int l = n + 5;
        for ( ; n < l; n++) {
            System.out.println("[" + (n + 1) + "]" + " = " + (n + 2));

        }
    }

// Task # 18
//  Написать метод, который принимает параметры , n, и печатает последовательность чисел,
//  начиная с числа n, по формуле для n + 1 члена последовательности:
//n + 1 = 2n
//Длина последовательности.
    public static void task_18(int n, int l) {
        if (n < l) {
            System.out.println("[" + n + "]" + " = " + n);
            for (; n < l; n++) {

                    System.out.println("[" + (n + 1) + "]" + " = " + (n * 2));
                }
            } else {
            System.out.println("Invalid data");
        }

    }
// Task # 19
//   Сгенерируйте последовательность целых положительных  двузначных чисел,
//   в которых разница между первой цифрой (десятки) и второй цифрой (единицы) не превышает 3.
     public static void task_19() {
      int des = 0;
      int ed = 0;
      for (int i = 10; i < 100; i++) {
          des = i / 10;
          ed = i % 10;
          if (des - ed <= 3 && ed - des <= 3) {
              System.out.println(i);
          }
      }
     }


// Task # 20
// Написать метод, который вычислит значение функции:
 public static void task_20(double x) {
//        double f = ((2.5 * Math.pow(x, 3) + 6 * Math.pow(x, 2) - 30));
//        double f2 = (x + 1);
        if (x > 1.5) {
            System.out.println((2.5 * Math.pow(x,3) + 6 + Math.pow(x,2) - 30));
        }
          else if (x <= 1.5 && x >= 0) {
            System.out.println(x + 1);
        } else  {
            System.out.println( x);
        }
 }
 // Метод по огруглению числа double
    public static double formatDouble (double number, int d) {
        int num = (int) (number * Math.pow(10, d));
        number = num / Math.pow(10, d);
        return number;
    }
}