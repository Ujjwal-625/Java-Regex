import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLanguage {
    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        String regex = "\\b(JavaScript|Java|Python|Go|C\\+\\+|C#|Ruby|Swift|Kotlin|PHP|TypeScript|Rust|Perl|Scala|Dart)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> languages = new ArrayList<>();

        while (matcher.find()) {
            languages.add(matcher.group());  // Add matched language to the list
        }

        System.out.println(String.join(", ", languages));
    }
}
