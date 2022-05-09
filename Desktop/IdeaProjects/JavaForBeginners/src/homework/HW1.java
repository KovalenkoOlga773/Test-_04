package homework;

public class HW1 {

    public static void main(String[] args) {

       int a = 10;
       int b = 20;
       int s = 10;
       int t = s;
       String myNameInSlack = "Ольга";

        System.out.println(Task7(1, 2, 4, 6));



    }
    //Task # 7
    // Написать метод, который принимает на вход 5 целых чисел,
    // и возвращает массив из этих же чисел
    public static int[] Task7(int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};
        return arr;
    }
}
