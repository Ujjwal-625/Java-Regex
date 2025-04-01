import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidHexColor {
    public static void main(String[] args) {
        String regex="^#[0-9A-Fa-f]{6}$";

        Pattern pattern=Pattern.compile(regex);

        System.out.println("Enter hex code");

        Scanner sc=new Scanner(System.in);

        String hexCode=sc.next();

        Matcher matcher=pattern.matcher(hexCode);

        if(matcher.matches()){
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
