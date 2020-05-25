import java.util.regex.Matcher;
import java.util.regex.Pattern;

class GermanStyleDateChecker {
    static Matcher getMatcher(String dateString) {
        String dayRegex = "([0-2]?[1-9]|3[0-1])";
        String separatorRegex = "(\\.|\\-|\\s)";
        String monthRegex = "(0?[1-9]|1[0-2])";
        String yearRegex = "((19|20)?\\d{2})";
        String finalRegex = String.format("^%s%s%s%s%s$", dayRegex, separatorRegex, monthRegex, separatorRegex, yearRegex);
        Pattern pattern = Pattern.compile(finalRegex);
        return pattern.matcher(dateString);
    }
}
