package DataStructureInterview.Recursion;

public class StringRecursion {

    public static void main(String[] args) {

        String word="abcd";

        reverseMethod(word);
    }

    public static String reverseMethod(String s)
    {

        if(s.isEmpty())
        {
            return s;
        }

        else
        {
            System.out.print(s.charAt(s.length()-1));
            return reverseMethod(s.substring(0,s.length()-1));



        }

    }

}
