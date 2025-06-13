import java.util.*;
public class profitloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cp = sc.nextInt();
        int sp = sc.nextInt();
        int profit = sp - cp;
        int profitPercentage = (profit * 100) / cp;
        System.out.println("The Cost Price is INR "+cp+"and Selling Price in INR"+sp+"The profit is INR"+profit+"and the Profit Percentage is "+profitPercentage);
    }
}
