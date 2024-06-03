package javainterviewprograms.Strings;

public class StringABCDNUMBERSRetest {

    public static void main(String[] args)
    {
        //{Print the position of alphabets in numbers}
       char a='a';
       int test1= (int)a;
        System.out.println(test1);

        char b='b';

        int test2=(int)b;
        System.out.println(test2);


        //find the position of b

        int positionIndex=(test1-test2)+1;

        System.out.println("b poisition is "+positionIndex);

        // String with all alphabest :
        // if we iterate then we get the

        String text="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for(int i=0;i<text.length();i++)
        {

            char indChar=text.charAt(i);
            System.out.println(i+1+" "+indChar);

        }
        alphaCheck('d');

    }

    public static void alphaCheck(char c)
    {

       int input= (int) c;
       char firstCharacter= 'a';
       int aasciValue= (int)firstCharacter;

        System.out.println("input index "+input);
        System.out.println("firstCharacter index "+aasciValue);

        int result=(input-aasciValue)+1;

        System.out.println(result);




    }



}
