import java.util.*;
public class sum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        int i=0;
        while(i <= n){
            sum = sum + i;
            i++;
            if(n <= 0){
                break;
            }
        }
        System.out.println(sum);
    }
}
