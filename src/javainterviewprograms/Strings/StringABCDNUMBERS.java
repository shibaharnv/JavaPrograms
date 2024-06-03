package javainterviewprograms.Strings;

public class StringABCDNUMBERS {

    public static void main(String[] args)
    {
        //{Print the position of alphabets in numbers}


        String sample="abcd";

        char d='d';

        int dvalue= (int)d-'a'+1;

        System.out.println("dvale"+dvalue);

        for(int k=0;k<sample.length();k++)
        {
            char myChar=sample.charAt(k);

            int values= (int) myChar-'a'+1;

            System.out.print(myChar);
            System.out.print(" "+values);
            System.out.println();

        }


        char c='c';
       // int val= (int)(c)-'a'+1;
        int val= (int)'c'-'a'+1;

        System.out.println("Val"+val);

        String text="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char letter;
        char test='c';
        int value =((int)(test)-'a'+1);
        System.out.println("value"+value);


        char testing ='A';

        int valu2=((int)testing -'A');

        System.out.println("valu2"+valu2);




        for(int i=0; i<text.length(); i++)
        {
            letter = text.charAt(i);
            if(letter>='A' && letter<='Z')
                System.out.print(letter +" ");
            System.out.println((int)letter - 'A'+1);
            if(letter>='a' && letter<= 'z')
                System.out.println((int)letter - 'a'+1);
        }
    }
}
