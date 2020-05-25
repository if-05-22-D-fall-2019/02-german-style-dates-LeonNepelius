import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {
    public static Matcher getMatcher(String dateString) {
        Pattern pattern = Pattern.compile(""); //TODO Regex
        return pattern.matcher(dateString);
    }
}
