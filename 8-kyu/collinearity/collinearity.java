public class Kata {
  
  public static boolean collinearity(int x1, int y1, int x2, int y2) {
  
    System.out.println("coordinates" + x1 + x2 + y2 + y2);
    int crossProd = x1*y2 - x2*y1;
    
    if (crossProd == 0) {
      return true;
    } else {
      return false;
    }
​
    
  }
}