import java.util.*;
public class AverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mathsMarks = sc.nextInt();
        int physicsMarks = sc.nextInt();
        int chemistryMarks = sc.nextInt();

        int ans = (mathsMarks+physicsMarks+chemistryMarks)/3;
        System.out.println("Sam's average mark in PCM "+ans);
    }
}
