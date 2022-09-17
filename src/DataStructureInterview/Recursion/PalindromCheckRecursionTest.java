package DataStructureInterview.Recursion;

public class PalindromCheckRecursionTest {

    public static void main(String[] args) {

        //{How to check if a string is a palindrome
        // check the first and last letter are same t
        //then remove the first and last letter
        // }

        String word="hi";
        

        System.out.println("length "+word.length());

        boolean result =isPalindrome(word);

        if(result)
        {
            System.out.println("Given string is palindrome");
        }

        else
        {
            System.out.println("Given string is not palindrome");
        }
    }

    public static boolean isPalindrome(String inputWord)
    {

        System.out.println(inputWord);


        if(inputWord.length()==0 || inputWord.length()==1)
        {
            return true;
        }

        if(inputWord.charAt(0)==inputWord.charAt(inputWord.length()-1))

        return isPalindrome(inputWord.substring(1,inputWord.length()-1));

        return false;

    }
}
