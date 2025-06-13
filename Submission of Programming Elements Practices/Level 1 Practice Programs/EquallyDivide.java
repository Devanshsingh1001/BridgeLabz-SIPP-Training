import java.util.*;
public class EquallyDivide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pens = sc.nextInt();
        int students = sc.nextInt();
        int dev = pens % students;
        int dev1 = pens / students;

        System.out.println("The Pen Per Student is "+dev1+"ans the remaining pen not distributed"+dev);
    }
}
