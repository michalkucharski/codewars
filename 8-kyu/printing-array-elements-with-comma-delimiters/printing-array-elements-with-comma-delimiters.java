import java.util.Arrays;
public class ArrayPrinter {
​
    public static String printArray(Object[] array) {
      String[] stringArray = Arrays.stream(array)
                .map(Object::toString)
                .toArray(String[]::new);
      return String.join(",", stringArray);
    }
}