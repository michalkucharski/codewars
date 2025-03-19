public class XO {
  
  public static boolean getXO (String str) {
    
    String xS = str.toLowerCase().replace("x", "");
    String oS = str.toLowerCase().replace("o", "");
    
    return (xS.length() == oS.length()) ? true : false;
    
  }
}