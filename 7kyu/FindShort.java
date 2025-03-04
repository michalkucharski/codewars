import java.util.Arrays;

public class FindShort {
    public static int findShort(String s) {
        return Arrays.stream(s.split(" ")).map(n -> n.length()).min(Integer::compareTo).get();
    }

    public static void main(String[] args) {
        int result = findShort("ghfsg fsferrw sfsfs fesfes");

        System.out.println(result);
    }
}
