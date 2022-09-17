package javainterviewprograms.Strings;

public class StringsSwappingRetest {
    public static void main(String[] args)
    {
            String s1="abc";
            String s2="xyz";

            //Using temp variable

            String temp="";

            temp=s1;
            s1=s2;
            s2=temp;

        System.out.println("s1 "+s1);
        System.out.println("s2 "+s2);

        // Without temp variable

        //{add both the Strings
        // }

        s1=s1+s2;
        System.out.println(s1);

        s2=s1.substring(3);

        System.out.println("s2 "+s2);
        s1=s1.substring(0,3);

        System.out.println("s1 "+s1);



    }
}
