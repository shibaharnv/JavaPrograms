package javainterviewprograms.Strings;

public class StringMiddleCharacterEvenRetest {

    public static void main(String[] args)
    {
        String word= "adccde";
        //{Print the middle character
        // get the length of the string and divide by 2
        // odd number num%2=1
        // even number num%2=0
        // if even number then return }

        int length =word.length();

        System.out.println(length);

        if(length%2==0)
        {
            int evenlen= length/2;
            char[] wordCharArray=word.toCharArray();

            char outputChar1=wordCharArray[evenlen];
            char outputChar2=wordCharArray[evenlen-1];

            System.out.println(outputChar1);
            System.out.println(outputChar2);
        }

        else if(length%2==1)
        {
            int len= length/2;

            System.out.println(len);

            char[] wordCharArray=word.toCharArray();

            char outputChar=wordCharArray[len];

            System.out.println(outputChar);
        }









    }
}
