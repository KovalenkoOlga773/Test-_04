public class main {

    public static void main(String[] args) {
        System.out.println(abbrevName("Jenn Jons"));

    }

//https://www.codewars.com/kata/53ee5429ba190077850011d4/train/java
//You Can't Code Under Pressure #1

    public static int doubleInteger(int i) {
        // Double the integer and return it!
        return i * 2;
    }

    //public static void main(String[] args) {
    //System.out.println(doubleInteger(4));
    //}

    //https://www.codewars.com/kata/555086d53eac039a2a000083/train/java
    //Opposites Attract
    public static boolean isLove(final int flower1, final int flower2) {
        return (flower1 % 2 == 0 && flower2 % 2 == 1) || (flower1 % 2 == 1 && flower2 % 2 == 0);

    }

    //public static void main(String[] args) {
    //   System.out.println(isLove(4, 3));
    //  }

    //https://www.codewars.com/kata/5265326f5fda8eb1160004c8/train/java
    //Convert a Number to a String!
    public static String numberToString(int num) {
        // Return a string of the number here!
        return String.valueOf(num);
    }

    //public static void main(String[] args) {
    //System.out.println(numberToString(5));

    //https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java
//Find the smallest integer in the array
    public static int findSmallestInt(int[] args) {
        int min = args[0];
        for (int i = 1; i < args.length; i++) {
            if (min > args[i]) {
                min = args[i];
            }

        }
        return min;
    }

////https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/train/java
////If you can't sleep, just count sheep!!
//    public static String countingSheep(int num) {
//    //Add your code here
//    }
//
//    public static void main(String[] args) {
//        System.out.println(countingSheep(4));
//    }

// 8.1 Task # 1
// https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/train/java
// Напишите функцию для преобразования имени в инициалы.

public static String abbrevName(String name) {
    String name1  = String.valueOf(name.charAt(0));
    String name2 = "";

    for (int i = 0; i < name.length(); i++) {
        if (String.valueOf(name.charAt(i)).equals(" ")) {
            name2 = String.valueOf(name.charAt(i + 1));
        }
    }
    return (name1 + "." + name2).toUpperCase();
}

    // 8.1 Task #2
    //  https://www.codewars.com/kata/5aa736a455f906981800360d/train/java
//Напишите функцию feast, которая принимает имя животного и блюдо в качестве аргументов
// и возвращает true или false, чтобы указать, разрешено ли животному принести блюдо на пир.
    public static boolean feast(String beast, String dish) {

        String[] animal = beast.split("");
        // String fisrtLetter = animal[0];
        // String lastLetter = animal[(animal.length)-1];

        String[] food = dish.split("");

        if (animal[0].equals(food[0]) &&
                animal[(animal.length) - 1].equals(food[(food.length) - 1])) {
            return true;

        } else {
            return false;
        }

    }
// 8.1 Task # 3
//https://www.codewars.com/kata/5704aea738428f4d30000914/train/java
// Создайте функцию, которая будет возвращать строку, объединяющую все буквы трех введенных строк в группы.
public static String tripleTrouble(String bm, String aa, String tn) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < bm.length(); i++) {
        sb.append(bm.charAt(i));
        sb.append(aa.charAt(i));
        sb.append(tn.charAt(i));
    }
    return sb.toString();


}
// 8.1 Task 4
    //https://www.codewars.com/kata/5a2be17aee1aaefe2a000151/train/java
//    Сложить массивы
public static int arrayPlusArray(int[] arr1, int[] arr2) {
    // arr1 + arr2 is not working...

    int sum = 0;
    for (int i = 0; i < arr1.length; i++) {
        sum += arr1[i] + arr2[i];
    }
    return sum;

}
// 8.1 Task %
//    https://www.codewars.com/kata/5808e2006b65bff35500008f/solutions
    // Написать буквы по алфавиту

    public static String position(char alphabet)
    {
        int position = 0;
        for(int i=(int)'a'; i<=(int)'z'; i++){
            position++;
            if(alphabet == i) break;

        }
        return "Position of alphabet: " + position;

    }

}










