package javainterviewprograms.Strings;

public class StringCountCharacter {

    public static void main(String[] args)
    {

        String s="testingt";

        Character givenCharacter='t';

        Character c;

        int count=0;

        for(int i=0; i<s.length();i++)
        {
            c=s.charAt(i);

            if(givenCharacter==c)
            {
                count++;
            }


        }

        System.out.println("givenCharacter "+givenCharacter+ "is occuring"+count+ "times " );



        String word = "test test test";

        int wordlength =word.length();
        System.out.println(wordlength);

        word= word.replaceAll("t","");
        int wordlength_afterRemove= word.length();

        System.out.println(wordlength_afterRemove);

        int noOfTimes= wordlength-wordlength_afterRemove;
        System.out.println(noOfTimes);
    }
}
