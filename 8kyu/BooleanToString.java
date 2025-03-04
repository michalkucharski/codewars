public class BooleanToString {
    public static String convert(boolean b) {
        return b ? "true" : "false";
    }

    public static void main(String[] args) {
        String convert = convert(true);

        System.out.println(convert);
    }
}
