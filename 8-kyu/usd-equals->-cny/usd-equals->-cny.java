import java.math.BigDecimal;
import java.math.RoundingMode;
public class Kata {
  public static String usdcny(int usd) {
    BigDecimal changeRate = new BigDecimal(6.75);
    BigDecimal usdBig = new BigDecimal(usd);
    String cny = usdBig.multiply(changeRate).setScale(2, RoundingMode.HALF_UP).toString();
    return cny + " Chinese Yuan"; // your code here
  }
}