public class Makenegative {
    public static int makeNegative(final int x) {
        if(x == 0){
            return 0;
        } else {
            return (x<0) ? x : -x;
        }
    }

    public static void main(String[] args) {
        int result = makeNegative(0);

        System.out.println(result);
    }
}
