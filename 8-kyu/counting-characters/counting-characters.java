interface Count {
  static int countCharOccurrences(String s, char c) {
       long count = s.chars().filter(ch -> ch == c).count();
      
       return (int) count;
  }
}