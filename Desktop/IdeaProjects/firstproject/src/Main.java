public class Main {

    public static void main(String[] args) {

        System.out.println(NumberOfWeek(0));

    }
    /**
     * Task # 2
     * Написать метод, который принимает на вход число от 1 до 7
     * и возвращает день недели.
     */
    public static String NumberOfWeek(int number) {
        //число от 1 до 7
        String day = "";
        if (number >= 0 || number >= 7) {
            day = "Wrong number";
            return day;
        }
        if (number == 1) {
             day = "Monday";
            return day;
        }
        if (number == 2) {
            day = "Tuesday";
            return day;
        }
        if (number == 3) {
            day = "Wednesday";
            return day;
        }
        if (number == 4) {
            day = "Thursday";
            return day;
        }
        if (number == 4) {
            day = "Thursday";
            return day;
        }
        if (number == 5) {
            day = "Friday";
            return day;
        }
        if (number == 6) {
            day = "Saturday";
            return day;
        }
        if (number == 7) {
            day = "Sunday";
            return day;
        }  else { day = "Game over";
                return day;
        }


    }





}
