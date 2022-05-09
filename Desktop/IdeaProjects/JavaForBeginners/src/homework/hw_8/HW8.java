package homework.hw_8;


import static Utils.Utils.createArrayRandomInt;
import static Utils.Utils.line;
import static homework.hw_8.HW_8_M.Task7;

public class HW8 {
    public static void main(String[] args) {
        // Task # 4
        //Импортировать статичные методы класса Utils, которые вы будете использовать
        // во время выполнения HW8

// Task # 5
//     Создать объекты типа Integer, Double, String и присвоить им такие же значения,
//     как и переменным класса HW8_1

        Integer i = new Integer(1);
        Double d = new Double(1.0);
        String str = new String("Shurik");

// Task # 6
//    Сравнить переменные соответствующих типов из классов HW8_1 и HW8 и
//    распечатать результат сравнения в виде таблички:
//HW8	 		|HW8_1			|areEquals?
//____________________________________________
//Double d = …	|Double d_1 = …		| true or false
        boolean isIntegerEqual = i.equals(HW8_1.i_1);
        boolean isDoubleEqual = d.equals(HW8_1.d_1);
        boolean isStringEqual = str.equals(HW8_1.str_1);

        line();

        System.out.println(i.equals(HW8_1.i_1));
        System.out.println(d.equals(HW8_1.d_1));
        System.out.println(str.equals(HW8_1.str_1));

        line();

        System.out.println(isIntegerEqual);
        System.out.println(isDoubleEqual);
        System.out.println(isStringEqual);

        line();

        String line = "-----------------------------------------";

        System.out.println(line);
        System.out.println("|\tHW\t\t" + "|\tHW_1\t" + "|\tareEquals?\t|");
        System.out.println(line);
        System.out.println("|\t" + i + "\t\t" + "|\t" + HW8_1.i_1 + " \t\t|\t" +
                isIntegerEqual + "\t\t|");
        System.out.println(line);
        System.out.println("|\t" + d + "\t\t" + "|\t" + HW8_1.d_1 + " \t|\t" +
                isDoubleEqual + "\t\t|");
        System.out.println(line);
        System.out.println("|\t" + str + "\t" + "|\t" + HW8_1.str_1 + " \t|\t" +
                isStringEqual + "\t\t|");
        System.out.println(line);


    //Task # 7
    // Написать метод, который принимает на вход 5 целых чисел,
    // и возвращает массив из этих же чисел
        System.out.println("Task # 7");
        System.out.println(Task7(1, 3, 4, 5, 4));

    //Task # 8
   //Написать метод, который принимает на вход 5 чисел типа double,  и возвращает массив из этих же чисел







    }
    }

