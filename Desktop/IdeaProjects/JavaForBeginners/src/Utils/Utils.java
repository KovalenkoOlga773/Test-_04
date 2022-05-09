package Utils;

public class Utils {

    public static void line() {
        System.out.println("==========================================");
    }
    public static String verify( int a, int b) {
       if (a == b) {
           System.out.println("Pass");

           return "Pass";

       } else {
           System.out.println("Fail");

           return "Fail";
       }
    }

    public static String verify( double a, double b) {
        if (a == b) {
            System.out.println("Pass");

            return "Pass";

        } else {
            System.out.println("Fail");

            return "Fail";
        }
    }
    public static String verify(String String1, String String2) {
        if (String1.equals(String2)) {
            System.out.println("Pass");

            return "Pass";

        } else {
            System.out.println("Fail");

            return "Fail";
        }
    }
//Methods of Random
    public static int getRandomInt(int upper, int lower) {
        return (int)(Math.random() * (upper - lower) + lower);
    }
    public static double getRandomDouble(int upper, int lower) {
        return ((Math.random() * (upper - lower) + lower));
    }
    public static int[] createArrayRandomInt(int length, int upper, int lower) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomInt(upper, lower);
        }
        return array;
    }
}
