import java.math.BigDecimal;
import java.math.RoundingMode;
public class Geometry{
  public static double squareArea(double A){
    double lSide = A/(Math.PI/2);
    double square = lSide * lSide;
    BigDecimal bd = BigDecimal.valueOf(square);
    bd = bd.setScale(2, RoundingMode.HALF_UP);   
    return bd.doubleValue();
  }
}