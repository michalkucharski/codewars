import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Kata{
  public static int countLettersAndDigits(String input){
        List<String> listIn = new ArrayList<String>(Arrays.asList(input.toUpperCase().split("")));
        System.out.println(listIn);
        long countNum = listIn.stream().filter(n -> n.matches("\\d+")).count();
        long countLett = listIn.stream().filter(n -> n.matches("[A-Z]+")).count();
    return (int) countNum + (int) countLett;
  }
}