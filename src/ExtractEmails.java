import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        String regex="^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}$";

        Pattern pattern=Pattern.compile(regex);

//        System.out.println("Enter hex code");


        String hexCode="Contact us at support@example.com and info@company.org";

        String [] arr=hexCode.split(" ");

        for(String i:arr){
            Matcher matcher=pattern.matcher(i);

            if(matcher.matches()){
                System.out.println(i);
            }
        }


    }
}
