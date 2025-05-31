public class Dinglemouse {
​
  // Return the number of seconds in a given number of hours
  public static long hoursToSeconds(final int hours) {
    System.out.println("Inpur:" + hours);
    final long ret = (long) hours * 60 * 60;
    System.out.println("Seconds" + ret);
    return ret;
  }
​
}