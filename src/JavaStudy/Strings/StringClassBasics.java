package JavaStudy.Strings;

public class StringClassBasics {

    public static void main(String[] args) {

        String a="hello";
        String b="hello";
        a=a.concat("world");

        System.out.println(a);
        System.out.println(b);
        System.out.println(a==b);

        String n1= new String("hello");
        String n2= new String("hello");

        System.out.println(n1.equals(n2));




    }
}
