import java.util.Arrays;
import java.util.stream.Collectors;

public class Count {
    static int countCharOccurrences(String s, char c) {

        String newS = Arrays.stream(s.split(" ")).filter(str -> str.matches("[aeiouAEIOU]")).collect(Collectors.joining());
        long count = s.chars().filter(ch -> ch == c).count();
        System.out.println(newS);
     //   return Arrays.stream(s.split(" ")).map(n -> n.contains(String.valueOf(c))).count();
        return (int) count;
    }

    public static void main(String[] args) {
        int result = countCharOccurrences("ghfs nndg deer", 'g');

        System.out.println(result);
    }
}
