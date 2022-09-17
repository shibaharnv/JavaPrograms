package javainterviewprograms.Strings;

public class StringMiddleCharacterEven {

    public static void main(String[] args)
    {
        String word= "amazons";

        //{The print middle character of a string. If the middle value has even then printed 2 characters Eg: Amazon –>print az}

        //{Logic find the middle value
        // count the number of characters  and if it is even then and divide by 2 if the number is even then print middle value and next value }

        int midValue=0;

        int wordLength=word.length();

        System.out.println(wordLength);

        midValue=(wordLength+1)/2;

        System.out.println(midValue);

        char[] wordCharArray=word.toCharArray();

        midChar(wordCharArray,wordLength);

    }


    public static String midChar(char[] wordCharArray,int wordLength)
    {

        int midValue=0;
        if(wordLength%2==0)
        {
            midValue=(wordLength)/2;
            char c=wordCharArray[midValue];

            System.out.println(c);

            char a=wordCharArray[midValue-1];

            String ans1= Character.toString(a)+Character.toString(c);

            System.out.println(ans1);

            return ans1;


        }
        else
        {
            midValue=(wordLength)/2;

            char b=wordCharArray[midValue];
            String ans2= Character.toString(b);
            System.out.println(ans2);
            return ans2;
        }
    }
}
