package javainterviewprograms.Strings;

public class StringVowelsRemove {

    public static void main(String[] args)
    {
        String word ="apple";
        //output -ppl

        char[] wordCharArray=word.toCharArray();

        for(int i=0;i< wordCharArray.length;i++)
        {
           // System.out.println(wordCharArray[i]);
            char c =wordCharArray[i];
            if(c=='a'||c=='i'||c=='e'||c=='o'||c=='u')
            {

            }
            else
            {
                System.out.print(""+c);
            }
        }
    }
}
