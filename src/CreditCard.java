import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCard {
    public static void main(String[] args) {
        String regex1="^[4][0-9]{15}$";
        String regex2="^[5][0-9]{15}$";

        Pattern pattern1= Pattern.compile(regex1);
        Pattern pattern2=Pattern.compile(regex2);

        System.out.println("Enter Credit card number");

        Scanner sc=new Scanner(System.in);

        String cardNo=sc.next();

        Matcher matcher =pattern1.matcher(cardNo);
        Matcher matcher1=pattern2.matcher(cardNo);

        if(matcher.matches()){
            System.out.println("Visa credit card");
        }
        else if(matcher1.matches()){
            System.out.println("MasterCard credit card");
        }
        else{
            System.out.println("Invalid credit card");
        }
    }
}
