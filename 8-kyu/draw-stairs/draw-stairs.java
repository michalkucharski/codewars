public class Stairs{
  public static String draw(int n){
    // do something
    String stairs = "I";
    String spaceS = " ";
    for (var i = 1; i < n ; ++i) {
        stairs =  stairs + "\n" + spaceS.repeat(i) + "I";    
    }
    System.out.print(stairs);
    return stairs;
  }
} 