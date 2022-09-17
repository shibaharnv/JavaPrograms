package javainterviewprograms.NaveenTrickyCodeQuestions;

public class StringLiteralsObjects {
    public static void main(String[] args)
    {
        String s1="hello world";
        String s2="hello world";
        String s3=s1;

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));//compare the content
        System.out.println(s2==s3);
        System.out.println(s3.equals(s2));

        String n1=new String("hello world");
        String n2= new String("hello world");

        System.out.println(n1==n2);
        System.out.println(n1.equals(n2));
    }

}
