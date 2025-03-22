import java.util.Arrays;
public class Kata {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    // Your code here
    double avg = Arrays.stream(classPoints)
      .average()
      .orElse(Double.NaN);
    
    return (yourPoints > (int)avg) ? true : false;
  }
}