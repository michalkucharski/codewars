import java.util.stream.IntStream;

public class Summation {
    public static int summation(int n) {


        return IntStream.rangeClosed(1, n).sum();
    }

    public static void main(String[] args) {
        int result = summation(3);

        System.out.println(result);
    }
}
