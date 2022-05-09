package homework;

public class HW_4_Task_10and19 {
    public static void main(String[] args) {
        Task10(9);
        Task19(Task10(2), 4);
        Task19(Task10(5), 25);
        Task19(Task10(0), 0);

    }

    public static String Task19 (int actual, int expected) {
//   Напишите тест, который валидирует (проверит правильность работы)
//   ваш код из задания №10. Тестовые данные - 2, 5, 0.
//   input 2 --> expected result 4: input 5 --> 25; input 0 -->0
        String result = " ";
        if(actual == expected) {
           // true
            result = "Passed";
        } else {
            //false
            result = "Failed";
        }
        System.out.println(result);
       return result;
    }



    public static int Task10(int number) {
        // Проверьте число на четность. Если число четное, удвойте это число,
//  иначе возведите число в квадрат.
//  Выведите результат работы алгоритма на печать.
//  Найдите в презентации, какой блок схеме соответствует ваш алгоритм.

        if (number % 2 == 0) {
            number = number * 2;
            return number;
        } else {
            number = number * number;
            return number;
        }






    }
}