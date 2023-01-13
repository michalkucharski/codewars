
/*Complete the solution so that it reverses all of the words within the string passed in.

Words are separated by exactly one space and there are no leading or trailing spaces.

Example(Input --> Output):

"The greatest victory is that which requires no battle" --> "battle no requires which that is victory greatest The"*/


public class ReverseWords{

 public static String reverseWords(String str){
   
   //Transform string into array
   String [] wordsList = str.trim().split(" ");
   
   String reversedWords = "";
   
   int i = wordsList.length - 1;

   //prepare reversed sentence
   while(i >= 0) {
     reversedWords = reversedWords + wordsList[i] + ' ';
     i--;
   }
   
   return reversedWords.trim();
      
 }
}