import java.util.*;
public class SmallestIn3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1 < num2 && num1 < num3){
            System.out.println("nums1 is the first number smallest");
        }
        else{
            System.out.println("num1 is not the smallest first number");
        }
    }
}
