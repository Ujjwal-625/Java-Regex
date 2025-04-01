import java.util.Arrays;
import java.util.List;

public class CensoreBadWords {
    public static void main(String[] args) {
        // List of bad words to censor
        String [] badWords={"damn","stupid"};

        // Input sentence
        String sentence = "This is a damn bad example with some stupid words.";

        // Replace each bad word with "****"
        for (String word : badWords) {
            String regex = "\\b" + word + "\\b"; // Match whole word only
            sentence = sentence.replaceAll(regex, "****");
        }

        // Output the censored sentence
        System.out.println(sentence);
    }
}
