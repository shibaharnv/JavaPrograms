package javainterviewprograms;

public class PalindromeNumberCheck {

    public static void main(String[] args) {


        int givenNumber=121;

        //{121%10 ---1
        // 12 %10-2
        // 1%10  --.2}

        int remainder=0;

        String reversedNumber="";
        String remainderString="";

        int quotient=0;
        while(givenNumber!=0)
        {
            quotient=givenNumber/10;
            remainder=(givenNumber%10);

            remainderString=String.valueOf(remainder);
            reversedNumber=reversedNumber+remainderString;
            givenNumber=quotient;
        }





        System.out.println(reversedNumber);
    }
}
