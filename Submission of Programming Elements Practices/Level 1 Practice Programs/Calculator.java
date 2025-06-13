import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextInt();
        double num2 = sc.nextInt();

        double add = num1 + num2;
        double sub = num1 - num2;
        double mul = num1 * num2;
        double div = num1 / num2;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+num1+" ans "+num2+" is "+add+" ,"+sub+" ,"+mul+" ,and "+div);
    }
}
