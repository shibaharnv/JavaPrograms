package javainterviewprograms.NlInterviewPreparation.Numbers;

public class PalindromeWithStringReverse {

    public static void main(String[] args) {

        int a=122;

        String input= String.valueOf(a);

        StringBuffer sb = new StringBuffer(input);

        sb.reverse();
        System.out.println(sb);
        String newString=sb.toString();

        if(input.equals(newString))
        {
            System.out.println("given number is palindrome");
        }
        else
        {
            System.out.println("given number is not palindrome");
        }
    }
}
