package lessons.lessons_1_to_7;

public class Additional_lessons_HW_1_5 {

//HW_5 Task # 8
//   Написать метод, который принимает на вход 2 параметра -  цену
//   и количество товара (может быть вес товара, или количество в штуках).
//   Алгоритм возвращает сумму покупки в виде десятичного числа.
   public static double  countTotalPrice (double price, double amount) {
       double totalPrice = 0;
       totalPrice = price * amount;

       return totalPrice;
   }

    public static String  countTotalPrice1 (double price, double amount) {
        double totalPrice = 0;
        totalPrice = price * amount;

        return totalPrice + " рублей";
    }

    public static boolean countTotalPrice2(double price, double amount) {
        double totalPrice = 0;
        totalPrice = price * amount;
        boolean flag = false;

        if (totalPrice > 5) {
            flag = true;
        }

        return flag;
    }











    public static void main(String[] args) {

        System.out.println(countTotalPrice(0.35, 10));
        System.out.println(countTotalPrice1(0.35, 10));
        System.out.println(countTotalPrice2(0.35, 10));
    }


}
