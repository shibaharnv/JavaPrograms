package javainterviewprograms.Strings;

public class StringPositionOfWord {

    public static void main(String[] args)
    {
        String word ="I am winning";

        String[] wordStringArray =word.split(" ");

for(int i=0;i< wordStringArray.length;i++)
{
    if(wordStringArray[i].equals("winning")) {

        System.out.println("position is  "+i);
    }
}
    }
}
