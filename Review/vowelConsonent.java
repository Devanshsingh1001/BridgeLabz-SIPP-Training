import java.util.*;
public class vowelConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vowels = "aeiouAEIOU";

        String str = sc.nextLine();

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);

            if(vowels.indexOf(c) != -1){
                System.out.println("vowels : "+c);
            }
            else{
                System.out.println("consonent : "+c);
            }
        }

    }
}
