import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidLiciencePlate {

    public static void main(String[] args) {
        String regex="^[A-Z][A-Z0-9]{5}$";

        Pattern pattern=Pattern.compile(regex);

        System.out.println("Enter user LiciencePlate example AB1234 ");

        Scanner sc=new Scanner(System.in);

        String liciencePlate=sc.next();

        Matcher matcher=pattern.matcher(liciencePlate);

        if(matcher.matches()){
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
