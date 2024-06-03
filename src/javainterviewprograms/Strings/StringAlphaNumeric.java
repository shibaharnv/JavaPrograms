package javainterviewprograms.Strings;

public class StringAlphaNumeric {
    public static void main(String[] args)
    {
        //{string Ex:1ABC34D768 the output shd be (1+34+768)
        // basically replace Alphabets with +}

        String word ="1ABC34D768";

        word=word.replaceAll("[A-Z]","+");
        System.out.println(word);
        word=word.replaceAll("[+][+][+]","+");
        System.out.println(word);

        //{Second try this is correct
        // }

        String input="AB1DAD2DSA3";

        input=input.replaceAll("[A-Z]","");
        System.out.println(input);

        int num= Integer.parseInt(input);
        System.out.println(num);

        int total=0;

        while (num>0)
        {
            int sum=0;
            sum=num%10;
            num=num/10;
            total=sum+total;


        }

        System.out.println(total);

       // int remain=0;
        int totals=0;

        int a=123;
        while (a>0) {
            int remain=0;
            remain = a % 10;
            a=a/10;
            totals = totals + remain;
        }

        System.out.println(totals);


    }





}
