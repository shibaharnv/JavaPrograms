package JavaStudy.Restudy;

public class StringBasicMethods {

    public static void main(String[] args) {

        String s= "word";
        String newString= "testing ";
        s=s.concat("hello");



        System.out.println(s);
        System.out.println(s.length());
        char c=s.charAt(0);
        System.out.println(c);
        int a=s.indexOf('w');
        System.out.println(a);

        System.out.println(newString.substring(1));
        System.out.println("subs 2" +newString.substring(1,3));


        int codePoint = newString.codePointAt(1);
        System.out.println("Unicode code point value of character at index 1: " + codePoint);


        String s3="test";


        s3=s3.replace("t","p");
        System.out.println(s3);
        String s4="madeof";

        System.out.println(s3.compareTo(s4));

        System.out.println(s3.contains("e"));

        String word="Tessting word";

        String[] abc =word.split(" ");

        System.out.println(abc[0]);
        System.out.println(abc[1]);

        System.out.println(word.indexOf("T"));
        System.out.println("ss "+word.lastIndexOf("s"));

        String myString = "teststring";

        myString= myString.replaceAll("t","w");

        System.out.println(myString);

    }
}
