package Collections.StringsPackage;

public class StringsClass {
    public static void main(String[] args)
    {

        // Strings are immutable - values of the object cannot be changed.

        String s="test";// String literal

        String t="test";

        s=s.concat("selenium");//This will  create new space in memory

        System.out.println(s);
        System.out.println(t);

        String word = new String("hello"); // String class

        // Mutable classes in string --- String buffer and String builder

        StringBuffer sb = new StringBuffer("hi");
        StringBuffer sb1 = new StringBuffer("hi");
        sb.append(" test");
        System.out.println("sb "+sb);
        System.out.println("sb1 "+sb1);
        sb.replace(1,3,"aa");
        System.out.println(sb);

        StringBuilder sbb1= new StringBuilder("bye");
        StringBuilder sbb2= new StringBuilder("bye");
        sbb1.append("test");
        System.out.println(sbb1);
        System.out.println(sbb2);


        String a= "testing";
        String b= "testing";

        System.out.println(a.equals(b));// Compares only the value

        System.out.println(a==b);//COmpare the object where it is point to

        String c = new String("testing");
        String d = new String("testing");

        System.out.println(c.equals(a));//true

        System.out.println(c==a);//false
        System.out.println(c==d);//false

    }
}
