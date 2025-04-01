import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameValidator {
    public static void main(String[] args) {

        String regex="^[a-zA-Z][a-zA-Z0-9_]{5,15}$";

        Pattern pattern=Pattern.compile(regex);

        System.out.println("Enter user name with following conditions ");

        System.out.println("Can only contain letters (a-z, A-Z), numbers (0-9), and underscores (_)\n" +
                "Must start with a letter\n" +
                "Must be between 5 to 15 characters long");

        Scanner sc=new Scanner(System.in);

        String userName=sc.next();

        Matcher matcher=pattern.matcher(userName);

        if(matcher.matches()){
            System.out.println("Valid username");
        }
        else{
            System.out.println("Invalid username");
        }
    }
}
