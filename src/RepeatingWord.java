import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatingWord {
    public static void main(String[] args) {
        String regex="\\b(\\w+)\\b(?:\\s+\\1\\b)+";

        Pattern pattern=Pattern.compile(regex);

        String sentance="This is is a repeated repeated word test.";

        Matcher matcher=pattern.matcher(sentance);

        while(matcher.find()){
            System.out.println(matcher.group(1));
        }
    }
}
