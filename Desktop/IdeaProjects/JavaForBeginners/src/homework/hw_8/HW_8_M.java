package homework.hw_8;

public class HW_8_M {
    //Task # 7
    // Написать метод, который принимает на вход 5 целых чисел,
    // и возвращает массив из этих же чисел
  public static int[] Task7(int a, int b, int c, int d, int e){
    int[] arr = {a, b, c, d, e};
    return arr;
    }
  // Task 8
  //   Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов
    public static double[] Task8(double a, double b, double c, double d, double e){
        double[] arr = {a, b, c, d, e};
        return arr;
    }

  // Task # 9
  //   Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов
    public static String[] task9(String a, String b, String c, String d, String e) {
      String[] arr = {a, b, c, d, e};
         return arr;
    }
  // Task # 10
    // Написать метод, который принимает на вход массив целых чисел,  и возвращает
    // массив тех же чисел, умноженных на 2.5
    public static int[] task10(int[] arr) {
      if (arr.length == 0) {
          System.out.println("Пустой массив");
          return null;
      } else {
          for (int i = 0; i < arr.length; i++) {
              arr[i] *= 2.5;
          }
      }
      return arr;
    }
}

