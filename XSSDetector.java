import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class XSSDetector {

    // Compiled regex patterns for common XSS vectors
    private static final List<Pattern> XSS_PATTERNS = Stream.of(
            "<script>(.*?)</script>",          // Script tags
            "src[\r\n]*=[\r\n]*\\\'(.*?)\\\'", // src attribute with single quotes
            "src[\r\n]*=[\r\n]*\\\"(.*?)\\\"", // src attribute with double quotes
            "</script>",                      // Closing script tag
            "<script(.*?)>",                  // Opening script tag
            "eval\\((.*?)\\)",                // eval() function
            "expression\\((.*?)\\)",          // CSS expression() function
            "javascript:",                    // JavaScript URI
            "vbscript:",                      // VBScript URI
            "onload(.*?)=",                   // Event handler
            "alert\\((.*?)\\)"                // alert() function
    ).map(pattern -> Pattern.compile(pattern, Pattern.CASE_INSENSITIVE))
     .collect(Collectors.toList());

    public static boolean containsXSS(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }

        return XSS_PATTERNS.stream()
                .anyMatch(pattern -> pattern.matcher(input).find());
    }

    public static void main(String[] args) {
        String input = "<script>alert('XSS');</script>";
        
        if (containsXSS(input)) {
            System.out.println("The input contains potential XSS attack vectors.");
        } else {
            System.out.println("The input is clean.");
        }
    }
}
