import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidSSNnumber {
    public static void main(String[] args) {
        String regex="[0-9]{3}-[0-9]{2}-[0-9]{4}";

        Pattern pattern =Pattern.compile(regex);

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your ssn number example 123-34-7899");

        String number=sc.next();

        Matcher matcher= pattern.matcher(number);

        if(matcher.matches()){
            System.out.println("Valid ssn number");
        }
        else{
            System.out.println("Invalid ssn number");
        }


    }
}
