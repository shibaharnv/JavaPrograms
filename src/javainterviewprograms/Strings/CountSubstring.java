package javainterviewprograms.Strings;

public class CountSubstring {

    public static void main(String[] args) {

        String largerString = "hellohellohello";
        String substring = "hello";

        System.out.println(largerString.indexOf(substring));

        System.out.println("substring index"+largerString.substring(largerString.indexOf(substring)));


        String ans=largerString.replace("hello","&");

        System.out.println(ans);
        System.out.println(ans.length());
    }
}
