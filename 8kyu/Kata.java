import java.util.stream.IntStream;

public class Kata {

    public static int squareSum(int[] n)
    {
        return IntStream.of(n).map(c -> c * c).reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        int[] n = {4,5,6};
        int squareSum = squareSum(n);

        System.out.println(squareSum);
    }
    
}
