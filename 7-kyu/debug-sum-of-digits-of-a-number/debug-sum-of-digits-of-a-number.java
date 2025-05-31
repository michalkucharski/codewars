public class Solution {
  public static int sumOfDigits(int n) {
    Integer sum = 0;
    String digits = String.valueOf(n);
    for (int i = 0; i < digits.length(); i++) {
      sum += Integer.parseInt(digits.substring(i, i+1));
    }
    return sum;
  }
}