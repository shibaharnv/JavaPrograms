package javainterviewprograms.Strings;

public class StringClass {

    public static void main(String[] args)
    {

        //String Literals
        String a="hello";
        String b="hello";
        a.concat("word");

        System.out.println("a "+a);
        System.out.println("b "+b);

        // String classes

        String s1= new String("hello");
        String s2= new String("hello");

        // Difference between equals and ==
        // Equals will always compare the content
        // == will always compare the referece of the object

        System.out.println("equals "+a.equals(b));//true
        System.out.println(a==b);//true
        System.out.println(s1.equals(a));//true
        System.out.println(s1==b);//false
        System.out.println(s1==s2);//false

    }
}
