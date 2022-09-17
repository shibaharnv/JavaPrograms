package javainterviewprograms.Strings;

public class StringsSwapping {
    public static void main(String[] args)
    {
        String s1="this";
        String s2="that";

        s1= s1+s2; //thisthat
        System.out.println("s1 :"+s1);
        //s1 should be that
        //s2 should be this
        s2=s1.substring(0,s2.length());

        System.out.println("s2 :"+s2);

        s1=s1.substring(s2.length(),s1.length());

        System.out.println("s1 :"+s1);




        //{Logic add two values
        // add both the strings
        // using substring }




    }
}
