import java.util.*;
public class Studentfee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int discountAmount = amount/10;
        int discountedFee = amount - discountAmount;

        System.out.println("The discount amount is INR "+discountAmount+"and final discounted fee is INR "+discountedFee);
    }
}
