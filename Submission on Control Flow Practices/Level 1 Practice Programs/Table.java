import java.util.*;
public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prod = 1;

        for(int i=1;i<=10;i++){
            prod = n * i;
            System.out.println(prod);
        }
    }
}
