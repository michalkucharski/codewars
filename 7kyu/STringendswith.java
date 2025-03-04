public class STringendswith {

    public static boolean solution(String str, String ending) {
        return (str.endsWith(ending)?true : false);
    }

    public static void main(String[] args) {
        boolean result = solution("atlanta", "anta");

        System.out.println(result);
    }
}
