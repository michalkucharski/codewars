import java.util.*;
public class Kata {
  
  public static Object[] removeEveryOther(Object[] arr) {
    // happy coding
    List<Object> list = new ArrayList<Object>();
    for (int i = 0; i < arr.length; i += 2) {
      list.add(arr[i]);
    }
    return list.toArray();
  }
}