package homework;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HW_7 {

    public static void main(String[] args) {
// Task # 1
// Создать массив catsNames, заполнить его любыми значениями (см картинку котов из презентации).
        // v_1
        System.out.println("Task_1_v_1");

        String[] catsNames;
        catsNames = new String[8];

        catsNames[0] = "Васька";
        catsNames[1] = "Пушок";
        catsNames[2] = "Муська";
        catsNames[3] = "Мурзик";
        catsNames[4] = "Барсик";
        catsNames[5] = "Мурка";
        catsNames[6] = "Гарфилд";
        catsNames[7] = "Том";

        for (int i = 0; i < catsNames.length; i++) {
            System.out.println(catsNames[i]);
        }
        //  v_2
        System.out.println("Task_1_v_2");
        String[] catsNames1 = {"Васька", "Пушок", "Муська", "Мурзик", "Барсик", "Мурка", "Гарфилд", "Том"};

        for (int i = 0; i < catsNames1.length; i++) {
            System.out.println(catsNames1[i]);
        }

//Task # 2
// В массиве catsNames изменить значение элемента с индексом 4 на “Рыжик”,
// а значение элемента с индексом 1 на “Черныш”.

        System.out.println("Task # 2");

        catsNames[4] = "Рыжик";
        catsNames[1] = "Черныш";

        for (int i = 0; i <= 7; i++) {
            System.out.println(catsNames[i]);
        }

//Task # 3
//  Создать массив catsColors и заполнить его значениями.

        System.out.println("Task # 3");

        String[] catsColors =
                {"Серый", "Черный", "Серый",
                        "Серый", "Рыжий", "Серый", "Рыжий",
                        "Серый"};

        for (int i = 0; i < 8; i++) {
            System.out.println(catsColors[i]);
        }

// Task # 4
//  Создать массив catsAges и заполнить его любыми значениями.

        System.out.println("Task # 4");

        int[] catsAges = {4, 10, 3, 1, 2, 5, 6, 700};
        // catsAges = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.println(catsAges[i]);
        }

// Task # 5
//  Создать массив isCatRed и заполнить его соответствующими значениями
        System.out.println("Task # 5");

        boolean[] isCatRed = new boolean[catsColors.length];

        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("Рыжий")) {
                System.out.println(isCatRed[i] = true);
            } else {
                System.out.println(isCatRed[i] = false);
            }
        }
// Task # 6
// Распечатать для массивов catsNames и catsColors:
//  1) имя кота в коробке с номером 6
//  2) имена котов из коробок с четными индексами
//  3) имена котов из коробок, чьи индексы кратны 4
//  4) цвет котов из коробок с нечетными индексами
//  5) цвет котов из коробок, чьи индексы кратны 3
        System.out.println("Task # 6.1");
        System.out.println(catsNames[6]);
        System.out.println("Task # 6.2");
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " - " + catsNames[i]);

            }

        }
        System.out.println("Task # 6.3");
        for (int i = 0; i < 8; i++) {
            if (i % 4 == 0) {
                System.out.println(i + " - " + catsNames[i]);

            }
        }

        System.out.println("Task # 6.4");
        for (int i = 0; i < 8; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " - " + catsColors[i]);
            }
        }

        System.out.println("Task # 6.5");
        for (int i = 0; i < 8; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " - " + catsColors[i]);
            }
        }
        // Task # 7
        //  Распечатать “Накорми кота!” для всех серых котов

        System.out.println("Task # 7");
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("Серый")) {
                System.out.println(i + " Накорми серого кота!");
            }

        }
// Task # 8
//  Распечатать “Отнеси кота на прививку!”, если возраст кота меньше 2 лет
        System.out.println("Task # 8");
        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] < 0 || catsAges[i] > 50) {
                System.out.println("Error");
            } else if (catsAges[i] < 2) {
                System.out.println("Отнеси кота " + catsNames[i] + " на прививку");
            } else {
                System.out.println("Кот стается дома");
            }
        }
//Task # 9
// Для кота в последней коробке распечатать имя, цвет, возраст
        System.out.println("Task # 9");
        for (int i = 0; i < catsNames.length; i++) {
            if ((catsNames.length == catsColors.length) && (catsNames.length == catsAges.length)) {
                if (i == (catsNames.length - 1)) {
                    System.out.println("Name: " + catsNames[i] + " Color: " + catsColors[i] + " Age: "
                            + catsAges[i]);

                }
            }
        }

// Task # 10
// Распечатать имена всех котов, чей возраст больше 2 лет
        System.out.println("Task # 10");
        if ((catsNames.length == catsColors.length) && (catsNames.length == catsAges.length)) {
            for (int i = 0; i < catsAges.length; i++) {
                if (catsAges[i] > 2) {
                    System.out.println("Имя " + catsNames[i] + " цвет " + catsColors[i] + " возраст " + catsAges[i]);
                }
            }
        }
// Task # 11
// Распечатать “Накорми кота!” если имя кота “Рыжик” и значение isCatRed == true
        System.out.println("Task # 11");
        if (catsNames.length == isCatRed.length && catsNames.length != 0) {
            for (int i = 0; i < catsColors.length; i++) {
                if (catsNames[i].equals("Рыжик") && isCatRed[i] == true) {
                    System.out.println(catsNames[i] + " Feed the cat!");
                }

            }
        }
// Task # 12
//    Распечатать средний возраст котов из массива catsAges
        System.out.println("Task # 12");
        double sum = 0;
        for (int i = 0; i < catsAges.length; i++) {
            sum = sum + catsAges[i];
        }
        System.out.println(sum / catsAges.length);

// Task # 13
//    Распечатать возраст самого молодого кота
        System.out.println("Task # 13");
        double min = catsAges[0];
        for (int i = 1; i < catsAges.length; i++) {
            if (catsAges[i] < min) {
                min = catsAges[i];
            }
        }
        System.out.println("Возраст самого молодого кота  " + min);

// Task # 14
//     Распечатать возраст самого старого кота
        System.out.println("Task # 14");
        int max_age = Integer.MIN_VALUE;
        for (int i = 0; i < catsAges.length; i++) {
            if (max_age < catsAges[i]) {
                max_age = catsAges[i];
            }
        }
        System.out.println("Самый старый кот " + max_age);

        // Task # 15
        //    Распечатать количество серых котов
        System.out.println("Task # 15");
        int greyCat = 0;
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("Серый")) {
                greyCat++;
            }

        }
        System.out.println("Количество серых котов = " + greyCat);
// Task # 16
// Распечатать имя кота, если кот находится в коробке с четным индексом и его возраст не больше 3 лет
        System.out.println("Task # 16");
        if (catsAges.length == catsNames.length && catsNames.length != 0) {
            for (int i = 0; i < catsAges.length; i++) {
                if (i % 2 == 0 && catsAges[i] <= 3) {
                    if (catsAges[i] == 1) {
                        System.out.println("Koт " + catsNames[i] + ", его индекс [" + i + "], его возраст "
                                + catsAges[i] + " год");
                    } else {
                        System.out.println("Koт " + catsNames[i] + ", его индекс [" + i + "], его возраст "
                                + catsAges[i] + " года");
                    }
                }
            }
        }
// Task # 17
        // Создать массив четных положительных чисел, значения которых не больше 10. (заполняем значения с помощью цикла for)
        System.out.println("Task # 17");

//        int count = 0;
//        for (int j = 0; j <= 10; j++) {
//            if(j % 2 == 0) {
//                count++;
//
//            }
//        }
//        int[] massiv = new int [count];
//        int num = 0;
//        for (int i = 0; i < massiv.length; i++) {
//            if (num >= 0 && num < 10 && num % 2 == 0) {
//                massiv[i] = num;
//
//            }
//        }
//        num++;
//        System.out.println(Arrays.toString(massiv));

        int count = 0;
        for (int i = 0; i <= 10; i += 2) {
            count++;
        }
        int[] array17 = new int[count];
        int number = 0;
        for (int i = 0; i < count; i++) {
            array17[i] = number;
            number += 2;

        }
        System.out.println(Arrays.toString(array17));

        System.out.println("Task # 18");
        //       midValue(catsAges);

// Task # 19
// Создать массив нечетных отрицательных чисел в промежутке от -1000 до -900
        System.out.println("Task # 19");
        int a = 0;
        for (int i = -1000; i < -900; i++) {
            if (i % 2 != 0) {
                a++;
            }
        }

        int[] negative = new int[a];
        for (int i = -1000, k = 0; i < -900; i++) {
            if (k < negative.length) {
                if (i % 2 != 0) {
                    negative[k] = i;
                    System.out.print(negative[k] + " ");
                    k++;
                }

            }
        }
        System.out.println();
// Task # 20
// Создать массив из 10 случайных положительных целых чисел
        System.out.println("Task # 20");

        int[] array20 = new int[10];
        for (int i = 0; i < array20.length; i++) {
                array20[i] = ((int) (Math.random() *10));
                System.out.println(array20[i] + " ");
            }
 // Task # 21
        System.out.println("Task # 21");
        int[] test = getMinMaxAverage(array20);
        int[] test2 = getMinMaxAverage(array17);
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
        System.out.println();
        for (int i = 0; i < test2.length; i++) {
            System.out.println(test[i]);
        }
        System.out.println();
        int[] test3 = getMinMaxAverage(catsAges);
        for (int i = 0; i < test3.length; i++) {
            System.out.println(test3[i]);
        }
// Task # 22
//   Создать массив четных чисел и массив нечетных чисел из элементов массива из задания 20.
        System.out.println("Task # 22");
    int lengthEven = 0;
    int lengthOdd = 0;

    for (int i = 0; i < array20.length; i++) {
        if (array20[i] % 2 == 0) {
            lengthEven++;
        } else {
            lengthOdd++;
        }
    }
    int[] even = new int [lengthEven];
    int [] odd = new int [lengthOdd];
    int countEven = 0;
    int countOdd = 0;

    for (int i = 0; i < array20.length; i++) {
        if (array20[i] % 2 == 0 && countEven < even.length) {
            even[countEven] = array20[i];
            countEven++;
        } else if (countOdd < odd.length) {
            odd[countOdd] = array20[i];
            countOdd++;
        }
    }
        System.out.println(Arrays.toString(even));
        System.out.println(Arrays.toString(odd));

        // Task # 23
//     Создать двумерный массив, который состоит из имен, возрастов, цветов котов:
//Распечатать все данные котов в коробках с четными индексами, используя двумерный массив.
        System.out.println("Task # 23");
        String[][] twoDimArray = new String[3][8];
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[0].length; j++) {
                if (i == 0) {
                    twoDimArray[i][j] = catsNames[j];
                } else if (i == 1) {
                    twoDimArray[i][j] = String.valueOf(catsAges[j]);
                } else {

                    twoDimArray[i][j] = catsColors[j];
                }
            }
        }
        System.out.println(Arrays.deepToString(twoDimArray));
        System.out.println();
// v_2
        String [][]  array23 = new String[3][8];
        if (catsNames.length == array23[0].length && catsAges.length == array23[0].length
                && catsColors.length == array23[0].length) {
            for (int i = 0; i < array23[0].length; i++) {
                array23[0][i] = catsNames[i];
                array23[1][i] = String.valueOf(catsAges[i]);
                array23[2][i] = catsColors[i];

            }
            System.out.println(Arrays.deepToString(array23));
        }
// Task 24
// Создать двумерный массив целых случайных чисел от 1 до 10 размерности 4*8.
        System.out.println("task # 24");
        int [][] array24 = ctreate20ArrayRandom(4, 8, 10, 1);
        System.out.println(Arrays.deepToString(array24));

// Task # 25
//   Вывести сумму всех четных чисел массива из задания 24.
        System.out.println("Task # 25");
      sum = 0;
      for (int c = 0; c < array24[0].length; c++) {
          for (int r = 0; r < array24.length; r++) {
              if (array24[r][c] % 2 == 0) {
                  sum += array24[r][c];
              }
          }
      }
        System.out.println(sum);
        }






    // Методы
    // Task # 18
//   Написать метод, который принимает на вход массив int, и возвращает среднее значение.
//   Проверить работу метода тестом, если параметр - массив catsAges
  public static double midValue (int[] array) {
        int midValue = 0;
        for (int i = 0; i < array.length; i++) {
            midValue = array[i];
            System.out.println(midValue / array.length);
        }
        return midValue / array.length;
  }
// Task # 21
//  Создать метод, который принимает на вход массив int,  и возвращает минимальное значение,
//  максимальное значение и среднее значение всех чисел массива. Проверить работу метода на массиве из задания 20.
// v_1
  public static int[] getMinMaxAverage(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        int average;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        average = sum / array.length;
        int[] result = new int[3];
        result[0] = min;
        result[1] = max;
        result[2] = average;
         return result;
  }
// v_2
//public static int [] task21arr (int[] array) {
//    int min = Integer.MAX_VALUE;
//    int max = Integer.MIN_VALUE;
//    double average;
//    int sum = 0;
//    for (int i = 0; i < array.length; i++) {
//        if (array[i] < min) {
//            min = array[i];
//        }
//        if (array[i] > max) {
//            max = array[i];
//        }
////            sum +=array[i];
////        } else {  average = sum / array.length;
////        int[] arr = (min, max, average);
////        return arr;
////
////    }
//    }

    // Task # 24
//     Создать двумерный массив целых случайных чисел от 1 до 10 размерности 4*8.

    public static int[][] ctreate20ArrayRandom(int row, int column, int upper, int lower)
    { int[][] array = new int[row][column];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = randomInt(upper, lower);
            }
        }
        return array;
    }

    // Метод рандом
    public static int randomInt (int upper, int lower) {
        return (int) (Math.random() * (upper - lower)) + lower;
    }


    }

