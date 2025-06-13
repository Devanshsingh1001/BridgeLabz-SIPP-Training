import java.util.*;
public class HarryAge {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int birthYear = sc.nextInt();
        int currentYear = sc.nextInt();

        int ans = currentYear - birthYear;
        System.out.println("Harry's age in 2024 is "+ans);
   } 
}
