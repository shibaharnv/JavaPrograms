package DataStructureInterview.Recursion;

public class PalindromeCheckRecursionFinal {

    public static void main(String[] args) {

        //{Check if the given string is palindrome or not using recursion
        // first using recurion reverse the string
        // so the recursion method should return the reversed string
        // store that string in a variable and compare
        // Logic for string reversal using recursion is first print the last character from the string
        // using substring method reduce the length of the string and assign it to the same string}

        String word ="hi";

       String result= reverseString(word);

        System.out.println(result);


    }

    public static String reverseString(String s)
    {
      if(s.isEmpty())
      {
          return s;

      }

      else
      {

          System.out.print(s.charAt(s.length()-1));

          return reverseString(s.substring(0,s.length()-1));

      }


    }
}
