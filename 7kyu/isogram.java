import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class isogram {
    public static boolean  isIsogram(String str) {
        Set<String> setIso = Arrays.stream(str.toLowerCase().split("")).collect(Collectors.toSet());
        int setSize = setIso.size();
        int strSize = str.length();

        int result = Integer.compare(strSize, setSize);
        return (result == 0 | str.isEmpty()) ? true: false;

    }

    public static void main(String[] args) {
        boolean isogram = isIsogram(" ");

                System.out.println(isogram);
    }
}

