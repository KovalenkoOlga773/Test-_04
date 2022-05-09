package lessons.lesson_8;

import static Utils.Utils.*;

public class lesson_8 {
    public static void main(String[] args) {
        // Способы создания массива
        int[] arr = new int[] {1, 2, 3};
        int[] arr1 = new int[3];
        int[] arr2 = {1, 2, 3};

        int[] arr3 = new int[0];
        int[] arr4 = {};

        int[] arr5 = new int[1];
        int[] arr6 = {0};

        int[] arr7 = new int[3];
        int[] arr8 = {0, 0, 0};

// Разница между примитивными и референстными типами
        int a = 4;
        double b = 5.5;

        Integer intReg = 4;
        Double doubReg = 5.5;

       // Integer intOject = new Integer(4);
        //Double doubObject = new Double(5.5);

        String str1 = "Hello";
        String str2 = "Hello";

        String strObject = new String("Hello");

        System.out.println(str1 == str2);
        System.out.println(str1 == strObject);

      // System.out.println(intReg == intReg);
       // System.out.println(intReg == intOject);

        String cat1 = "Cat";
        String cat2 = "Cat";
        String cat3 = new String("Cat");
        String cat4 = new String("Cat");
        String dog1 = new String("Dog");
        String dog2 = "Dog";

        System.out.println(cat3 == cat4);
        System.out.println("Cats");
        System.out.println(cat1 == lesson8_1.cat1_1);

        System.out.println(cat1.equals(cat3));
       // System.out.println(intReg.equals(intOject));

        verify(cat1, cat2);
       // verify(intReg, intOject);
    }
}
