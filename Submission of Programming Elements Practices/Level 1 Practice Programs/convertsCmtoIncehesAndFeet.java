import java.util.*;
public class convertsCmtoIncehesAndFeet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double height = sc.nextDouble();
        double totalinch =  height / 2.54;
        int feet = (int)totalinch / 12;
        int inch = (int)totalinch % 12;
        

        System.out.println("Your Height in cm is "+height+"while in feet is"+feet+"and inches is"+inch);
    }
}
