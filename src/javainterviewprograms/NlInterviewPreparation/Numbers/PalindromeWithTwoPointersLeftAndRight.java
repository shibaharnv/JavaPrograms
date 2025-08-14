package javainterviewprograms.NlInterviewPreparation.Numbers;

public class PalindromeWithTwoPointersLeftAndRight {

    public static void main(String[] args) {

        int a=122;
        String input=String.valueOf(a);
        boolean result=isPalindromeCheck(input);

        if(result)
        {
            System.out.println("Given number or string is palindrome");
        }
        else
        {
            System.out.println("Given number or string is not palindrome");
        }
    }

    private static boolean isPalindromeCheck(String input) {
        //{Take two points left and right
        // first pointer left as index 0 and right pointer index length-1
        // compare left index with right index it should always be equal if the number is even
        // if the number is odd it should ignore the center character}

        int leftPointer=0;
        int rightPointer=input.length()-1;


        while (leftPointer<rightPointer) {
            if (input.charAt(leftPointer) == input.charAt(rightPointer)) {
                leftPointer++;
                rightPointer--;
            }
            else {
                return false;
            }
            return true;
        }


        return false;
    }
}
