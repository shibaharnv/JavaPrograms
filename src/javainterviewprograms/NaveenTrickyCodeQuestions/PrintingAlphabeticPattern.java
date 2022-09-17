package javainterviewprograms.NaveenTrickyCodeQuestions;

public class PrintingAlphabeticPattern {

    public static void main(String[] args) {
        //{A
        // AB
        // ABC
        // ABCD}

        String word="ABCDEF";


        for(int i=1;i<=4;i++)
        {
            String concat="";
            for(int j=0;j<i;j++)
            {

                char tempchar=word.charAt(j);
                String temp= tempchar+"";

                concat=concat+temp;
            }

            System.out.println(concat);
        }

        int alpha=65;
        System.out.println((char)(alpha));

    }
}
