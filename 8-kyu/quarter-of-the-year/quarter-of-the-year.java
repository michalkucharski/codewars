import java.time.*; 
import java.time.temporal.*; 
public class Kata {
    public static int quarterOf(int month) {
        // Your code here
      return LocalDate.of(2000, month, 01).get(IsoFields.QUARTER_OF_YEAR);
    }
}