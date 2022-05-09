public class example {
    public static void main(String[] args) {
        System.out.println("Task 18");
        int ap = 40;
        int st = 6;
        int resultApple;
        resultApple = ap/st;
        int reminderApple;
        reminderApple = ap%st;
        String text1 = "Если ";
        String text2 = " яблок поделить на ";
        String text3 = " учеников, то каждый ученик получит по ";
        String text4 = " яблок, и ";
        String text5 = " яблок(а) останется учителю.";
        String text = text1 + ap + text2 + st + text3 + resultApple + text4 + reminderApple + text5;

        System.out.println(text);

         /*ap = 100;
         st = 21;
        resultApple = ap/st;
        reminderApple = ap%st;
        text1 = "Если ";
        text2 = " яблок поделить на ";
        text3 = " учеников, то каждый ученик получит по ";
        text4 = " яблок, и ";
        text5 = " яблок(а) останется учителю.";
        text = text1 + ap + text2 + st + text3 + resultApple + text4 + reminderApple + text5;
        System.out.println(text);*/

        ap = 100;
        st = 21;
        resultApple = ap/st;
        reminderApple = ap%st;
        System.out.println(resultApple);
        System.out.println(reminderApple);


    }
}
