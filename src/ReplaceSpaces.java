import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceSpaces {
    public static void main(String[] args) {
        String regex="\\s{2,}";

        Pattern pattern =Pattern.compile(regex);

        String sentance="This is an example         with multiple spaces.";

        Matcher matcher=pattern.matcher(sentance);

        System.out.println(matcher.replaceAll(" "));
    }
}
