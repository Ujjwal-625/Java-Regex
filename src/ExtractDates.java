import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDates {
    public static void main(String[] args) {
        String regex= "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";;


        Pattern pattern=Pattern.compile(regex);


        String sentance="  The events are scheduled for 12/05/2023 15/08/2024 and 29/02/2020 ";


        String [] arr=sentance.split(" ");

        for(String i:arr){
            Matcher matcher=pattern.matcher(i);

            if(matcher.matches()){
                System.out.println(i);
            }
        }


    }
}
