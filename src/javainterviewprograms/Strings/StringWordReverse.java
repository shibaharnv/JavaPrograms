package javainterviewprograms.Strings;

public class StringWordReverse {

    public static void main(String[] args) {

        String word= "abcd";

        StringBuffer sb = new StringBuffer(word);

        sb.reverse();

        System.out.println(sb);
    }
}
