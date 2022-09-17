package DataStructureInterview;

import java.security.PublicKey;
import java.util.Arrays;

public class Anagaramproblem {

    //{What is anagaram
    // if we have a word and with the characters of the word we can create another word then is called anagram}
        //Array can be printed seperatly we cannot club it with text

    public static void main(String[] args)
    {
        String word1 ="restfuld";
        String word2 ="flusterr";


        char[] chararray1=  word1.toCharArray();
        char[] chararray2=  word2.toCharArray();

        Arrays.sort(chararray1);
        Arrays.sort(chararray2);
        System.out.println(chararray1);
        System.out.println(chararray1);

        for(int i=0;i<chararray1.length;i++)
        {
            if(chararray1[i]!=chararray2[i])
            {
                System.out.println("given word is not a anargam");
            }

            else {
                System.out.println("Given word is anargam");
            }
        }

//        String output1 = "word 1 after sorting " + chararray1;
//        System.out.println("word 1 after sorting"+output1);
//        System.out.println("word 2 after sorting"+chararray2);

//      for(int i=0;i<chararray.length;i++)
//      {
//          char c = chararray[i];
//
//          System.out.println(c);
//      }
    }
}
