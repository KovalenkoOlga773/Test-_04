package homework;
import java.lang.Math;
public class HW_5_3 {
    public static void main(String[] args) {
        Largest_number (15, 0, -1);
    }

    public static void Largest_number(int x, int y, int z) {

        int max1 = Math.max(Math.max(x,y), z);

        System.out.println(max1);
             Integer largest;
        if(x > y) {
            largest = x;
        } else {
            largest = y;
        }
        if(largest > z)
                System.out.println(largest);
            else {
                largest = z;
                System.out.println(largest);

        }
    }

}
