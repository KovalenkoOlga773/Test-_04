import java.util.Random;

public class HW4_1 {
    public static void main(String[] args) {
        int a = 1;
        System.out.println("Task #" + a);
        /** Task 1
         * Дан массив:
         * int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
         *  необходимо вывести сумму всех значений массива.
         */
        int array[] = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum = " + sum);

        /** Task 2
         * Дан массив:
         * int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
         * необходимо вывести максимальное значение массива.
         */
        System.out.println("Task #" + ++a);
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        System.out.println("Max = " + maxValue);

        //v.2
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max = " + max);

        /** Task 3
         *  Дан массив:
         *  int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
         *  необходимо вывести минимальное значение массива.
         */
        System.out.println("Task #" + ++a);
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.println("Min = " + minValue);
        // v.2
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min = " + min);

        /** Task №4
         * * Дан массив:
         * int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
         * необходимо вывести среднее арифметическое всех значений массива.
         */
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Task #" + ++a);
        double avg = 0;
        for (int i = 0; i < array1.length; i++) {
            avg += (double) array1[i] / array1.length;
        }
        System.out.println("Average = " + avg);





        }


    }











