package JavaStudy.Restudy;

public class StringClassLiterals {

    public static void main(String[] args)
    {


        String s1="hello";
        String s2="hello";

        s2=s2.concat(" word");

        System.out.println(s1);
        System.out.println(s2);


        String s3= new String("hello");
        System.out.println(s3);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s3));

    }
}


