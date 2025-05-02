import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
​
public class MonkeyCounter
{
  public static int[] monkeyCount(final int n){
    
    return IntStream.rangeClosed(1, n).toArray();
  }
}