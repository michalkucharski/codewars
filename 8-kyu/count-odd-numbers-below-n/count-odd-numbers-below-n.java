public class Kata {
​
  public static int oddCount(int n){
​
    int counter = 0;
    for (int i = 1 ; i < n ; i = i + 2) {
        counter ++;
    }
    return counter;
  }
​
}