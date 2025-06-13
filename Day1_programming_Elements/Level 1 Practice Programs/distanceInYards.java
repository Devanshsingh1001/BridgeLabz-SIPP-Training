import java.util.*;
public class distanceInYards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double distanceInFeet = sc.nextDouble();
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        System.out.println(" Your Height in cm is" +distanceInFeet+"while in feet is"+distanceInYards+ "and inches is"+distanceInMiles);
    }

}
