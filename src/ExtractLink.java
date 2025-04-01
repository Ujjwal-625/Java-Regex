import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLink {
    public static void main(String[] args) {
        String regex= "https?://[^\\s]+";


        Pattern pattern=Pattern.compile(regex);


        String sentance="Visit https://www.google.com and http://example.org for more info";


        String [] arr=sentance.split(" ");

        for(String i:arr){
            Matcher matcher=pattern.matcher(i);

            if(matcher.matches()){
                System.out.println(i);
            }
        }

    }
}
