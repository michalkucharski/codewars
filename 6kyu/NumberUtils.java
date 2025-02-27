import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberUtils {
    public static boolean isNarcissistic(int number) {
        // TODO replace with your code
        double narcisticNum = 0.0;
        List<Integer> listNum = new ArrayList<>();
        int numberTot = number;
        while (numberTot > 0) {
            int digit = numberTot % 10;
            System.out.println(digit);

            listNum.add(digit);
            numberTot /= 10;
        }
        for (int i = 0; i < listNum.size(); i++) {

            narcisticNum = Math.pow((double) listNum.get(i), (double) listNum.size())+ narcisticNum;
            System.out.println("narcistic sum" + narcisticNum);
        }

        int result = Double.compare(narcisticNum, number);
        System.out.println("Narcisticnum" + narcisticNum);
        System.out.println("Number" + number);
        System.out.println("Result" + result);

        return  (result == 0) ? true : false;
    }

    public static void main(String[] args) {
        boolean narcissistic = isNarcissistic(153);

        System.out.println(narcissistic);
    }
}
