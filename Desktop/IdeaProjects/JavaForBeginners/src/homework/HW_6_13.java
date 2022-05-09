package homework;

public class HW_6_13 {
    public static void main(String[] args) {
        System.out.println(thirteenth());
        // Task 13
//Вывести последовательность 012345678900112233445566778899000…  до числа 9999 включительно.
 //   v_1
        System.out.println("Task # 13");
        int i, j, k;
        for (i = 0; i <= 9; i += 1) {
            System.out.print("\u001B[34m" + i);
        }
        for (j = 0;  j <= 9; j += 1) {
            System.out.print("\u001B[31m" + j + j + "\u001b[0m");
        }
        for (j = 0;  j <= 9; j += 1) {
            System.out.print("\u001B[31m" + j + j + j + j + "\u001b[0m");
        }

        }
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
//Распечатайте последовательность чисел:
//0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5

    }

