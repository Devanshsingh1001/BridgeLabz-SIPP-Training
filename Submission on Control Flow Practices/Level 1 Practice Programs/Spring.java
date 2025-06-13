import java.util.*;
public class Spring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();
        int date =sc.nextInt();

        if(date == 20 && (month.equalsIgnoreCase("march") || month.equalsIgnoreCase("april") || month.equalsIgnoreCase("may") || month.equalsIgnoreCase("june"))){
            System.out.println("its a spring season");
        }
        else{
            System.out.println("Not a Spring season");
        }
    }
}
