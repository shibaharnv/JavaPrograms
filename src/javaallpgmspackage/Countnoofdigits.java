package javaallpgmspackage;

public class Countnoofdigits {

    public static void main(String[] args)
    {

        //count digits --ex: 1000 --3
        int num=10033;

        //Method one  Convert that to String
        String abc="";
        abc=String.valueOf(num);
        System.out.println(abc);

        System.out.println(abc.length());


        String reverse="";
        for(int i=abc.length()-1;i>=0;i--)


        {
           char[] chararray= abc.toCharArray();

            reverse=reverse+ chararray[i];
            // char c = f
        }

        System.out.println("reverse "+reverse);

        //Method two: divide the number by 10

        //Important zero digit means count fo digit is zero
        //01 means the count of digit it 1



        int number =123;
        int count=0;
        while(number!=0)
        {
            number= number/10;
            ++count;
        }

        System.out.println("count "+count);
    }
}
