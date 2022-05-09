public class HW4_1a{
    public static void main(String[] args) {
        /** Task # 5
         *  Дан массив:
         *  int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
         *  необходимо вывести сумму элементов массива.
         */
        /*int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum = 0;
        for (int i = 0; i < array.length; i = i + 1) {
            for (int j = 0; j < array[i].length; j = j + 1) {
                sum = sum + array[i][j];
            }
        }
        System.out.println(sum);*/

        /** Task # 6
         * Дан массив:
         * int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
         * необходимо вывести максимальное значение массива.
         */
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i = i + 1) {
            for (int j = 0; j < array[i].length; j = j + 1) {
                if (array[i][j] > max)
                    max = array[i][j];
                }
            }
            System.out.println("Max = " + max);

            /** Task # 7
             * Дан массив:
             * int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
             * необходимо вывести количество элементов в массиве.
             */
            /*int count = 0;
            for (int i = 0; i < array.length; i = i + 1) {
                count = count + array.length;
            }
            System.out.println(count);*/
        }
    }

