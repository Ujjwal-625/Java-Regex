import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCapitalWords {
    public static void main(String[] args) {
        String regex="\\b\\w*[A-Z]\\w*\\b";
//        \b → Word boundary (ensures we match whole words).
//
           //\w* → Matches zero or more word characters before the uppercase letter.
//
            //[A-Z] → Ensures there is at least one uppercase letter.
//
            //\w* → Matches zero or more word characters after the uppercase letter.
//
            //\b → Word boundary.

        Pattern pattern=Pattern.compile(regex);

//        System.out.println("Enter hex code");


        String sentance="The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";


        String [] arr=sentance.split(" ");

        for(String i:arr){
            Matcher matcher=pattern.matcher(i);

            if(matcher.matches()){
                System.out.println(i);
            }
        }


    }
}
