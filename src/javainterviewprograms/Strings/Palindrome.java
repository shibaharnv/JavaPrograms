package javainterviewprograms.Strings;

public class Palindrome {

    public static void main(String[] args) {

        String s= "fsdfsd";


        System.out.println(isPalindrome(s));




    }

    public static boolean isPalindrome(String input)
    {

        StringBuffer sb = new StringBuffer(input);

        sb.reverse();
        String result=sb.toString();

        System.out.println(sb);

        if(input.equals(result))
        {
            return true;
        }

        else {
            return false;
        }



    }
}
