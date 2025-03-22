import java.util.stream.IntStream;
public class Solution {
  public static int[] distinct(int[] array){
      // your solution here
      return IntStream.of(array).distinct().toArray();
  }
}