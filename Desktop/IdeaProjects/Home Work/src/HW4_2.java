import java.util.Locale;

public class HW4_2 {
    public static void main(String[] args) {
        /** Task # 1
         * Дана строка:
         * String s = “Перестановочный алгоритм быстрого действия”;
         * необходимо вывести все буквы “о” из этой строки.
         * Для указанной строки ответ будет “ооооо” (или в столбик)
         */

        /*String s = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < s.length(); i = i + 1) {
            if (s.charAt(i) == 'о') {
                System.out.println(s.charAt(i));*/



        /** Task # 2
         * Дана строка:
         * String s = “Перевыборы выбранного президента”;
         * необходимо подсчитать количество букв “е” в строке.
         * Для указанной строки ответ будет 4.
         */
        /*String s = "Перевыборы выбранного президента";
        int count = 0;
        for (int i = 0; i < s.length(); i = i + 1) {
            if (s.charAt(i) == 'е') {
                count = count + 1;
            }
        }
        System.out.println(count);*/

        /**
         *  Дана строка:
         *  String s = “Посмотрите как Рите нравится ритм”;
         *  необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
         *  Для указанной строки ответ будет 6, 15, 29.
         */
        /*String s = "Посмотрите как Рите нравится ритм";
        s = s.toLowerCase();
        int index = s.indexOf("рит");
        while (index != -1) {
            System.out.println(index);
            index = s.indexOf("рит", index + 1);*/


        /**
         * Экстра задача

         * Дан массив:
         * String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”},
         * {“java”}};
         * необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.
         */

        String[][] array = {{"Привет", "всем", "кто" }, {"изучает", "язык", "программирования" }, {"java"}} ;
         int count = 0;
         for(int i = 0; i < array.length; i = i + 1) {
             for(int j = 0; j < array[i].length; j = j + 1) {
            if(!array[i][j].contains("е")) {
                count = count + 1;

                 }
             }
         }
        System.out.println(count);
        }


}
