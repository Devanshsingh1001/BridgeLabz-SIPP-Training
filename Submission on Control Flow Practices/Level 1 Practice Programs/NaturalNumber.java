import java.util.*;
public class NaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n > 0){
            System.out.println("n is a natural number");
            int ans = n*(n+1)/2;
            System.out.println(+ans+" is sum of "+n+" natural number");
        }
        else{
            System.out.println("n is not a natural number");
        }
    }
}
