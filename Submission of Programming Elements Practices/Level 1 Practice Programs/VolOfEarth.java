import java.util.*;
public class VolOfEarth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = 6378;
        double km = (double)(4/3) * 3.14 * r * r * r;
        double miles = km / 1.6;

        System.out.println("The volume of earth in cubic kilometers is "+km+"and cubic miles is "+miles);
    }
}
