import java.util.Arrays;

public class Vowels {

    public static int getCount(String str) {

        int vocalsCount = (int) Arrays.stream(str.split("")).filter(s -> s.matches("[aeiouAEIOU]")).count();

        return vocalsCount;
    }

    public static void main(String[] args) {
        int getCount = getCount("gfshfye");

        System.out.println(getCount);
    }
}
