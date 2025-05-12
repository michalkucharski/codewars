public class CollatzConjecture {  
  public static int hotpo(int n) {
    // TODO: Implement the function
    var cnt = 0;
    while (n != 1) {
      if (n % 2 == 0) {
        n = n/2;
      } else {
        n = 3 * n+1;
      }
      cnt ++;
    }
    return cnt;
  } 
}