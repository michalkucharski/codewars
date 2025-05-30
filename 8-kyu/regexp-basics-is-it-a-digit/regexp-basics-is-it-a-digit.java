import java.util.regex.Matcher;
import java.util.regex.Pattern;
​
public class StringUtils {
  
  public static boolean isDigit(String s) {
    // your code goes here
    return Pattern.matches("\\d", s);
  }
}