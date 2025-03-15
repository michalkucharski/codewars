public class algo {
    public static boolean interlockable(long a, long b) {

        //  <----  hajime!
        String  binSA = Long.toBinaryString(a);
        String  binSB = Long.toBinaryString(b);
        byte binA = Byte.parseByte(binSA);
        byte binB = Byte.parseByte(binSB);

        return binA^binB;
    }

    public static void main(String[] args) {
        boolean narcissistic = interlockable(2L, 3L);

        System.out.println(narcissistic);
    }
}
