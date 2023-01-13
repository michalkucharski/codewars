//Write a function that takes an integer as input, and returns the number of bits that are equal to one in the binary representation of that number. You can guarantee that input is non-negative.

//Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case

public class BitCounting {

	public static int countBits(int n){
		// Convert decimal number to binary
    String intToBinary = Integer.toBinaryString(n);
    
    System.out.println("Binary" + intToBinary);
    int result = 0;
    
    //Check if string incluve bit with value 1
    for (int i = 0; intToBinary.length() > i; ++i) {
      if (intToBinary.substring(i, i+1).contains("1"))
         result += 1;
    }
    return result;    
}
}