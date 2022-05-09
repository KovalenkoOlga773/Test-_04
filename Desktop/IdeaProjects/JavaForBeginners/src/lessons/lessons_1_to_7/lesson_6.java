package lessons.lessons_1_to_7;

public class lesson_6 {
    public static void main(String[] args) {
     //   for() {
        //   }

        // Печатаем "Java for beginners" для всех чисел от 1 до 5 включительно
        for(int i = 1; i < 6; i++) {
            System.out.println("Java for beginners");
        }
       // Печатаем числа от 1 до 5 вкл
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }
        //Печатаем только нечетные чмсла от 1 до 10 вкл
        //for(int i = 1; i < 11; i++) {
          //  if(i % 2 != 0) {
            //    System.out.println(i);
           // }

        for(int i = 1; i < 11; i = i + 2) {

         System.out.println(i);
        }
        //Печатаем только нечетные чмсла от 1 до 100 вкл шаг 10
        for(int i = 1; i <= 100; i += 10) {
            System.out.println(i);
        }
        //Печатаем все чмсла от 0 до 100 вкл к-рые кратные 10
        for (int i = 0; i < 101; i +=10) {
            System.out.println(i);
        }
        //Печатаем все чмсла от 0 до 100 вкл к-рые кратные 10
        for(int i = -100;i < 101; i +=10) {
            System.out.println(i);
        }
    }


}
