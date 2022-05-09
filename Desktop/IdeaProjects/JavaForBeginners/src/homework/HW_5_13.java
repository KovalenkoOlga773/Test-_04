package homework;

public class HW_5_13 {

   public static void main(String[] args) {

       LuckyNumber(1985);
   }
    public static void LuckyNumber(int year) {

        int n1 = year / 1000;
        int n2 = (year % 1000) / 100;
        int n3 = (year % 100) / 10;
        int n4 = (year % 10);
        int luckyNum = n1 + n2 + n3 + n4;

        if (luckyNum <= 9) {
            System.out.println(luckyNum);
        }  else {
            n1 = luckyNum / 10;
            n2 = luckyNum % 10;
            luckyNum = n1 + n2;
        }
            System.out.println(luckyNum);
            }
        }






