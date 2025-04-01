import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIpAddress {
    public static void main(String[] args) {
        String regex="^(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$";

        Pattern pattern= Pattern.compile(regex);

        System.out.println("Enter any ip address to validate");

        Scanner sc=new Scanner(System.in);

        String ip=sc.next();

        Matcher matcher =pattern.matcher(ip);

        if(matcher.matches()){
            System.out.println("Valid ip ");
        }
        else{
            System.out.println("Invalid ip address");
            System.out.println("Ip addresss should be like 123.234.231.0 i.e. no digit should be greater than 255");
            System.out.println("256.243.123.0 is not a valid ip because 256 is greater than 255");
        }
    }
}
