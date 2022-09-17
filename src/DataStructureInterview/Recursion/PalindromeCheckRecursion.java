package DataStructureInterview.Recursion;

public class PalindromeCheckRecursion {

    public static void main(String[] args) {

        String word ="hi";

        //firstway

        StringBuffer sb = new StringBuffer(word);

        System.out.println(sb.reverse());

        //second way using loop

        String result="" ;
        for(int i=word.length()-1;i>=0;i--)
        {
            char c= word.charAt(i);

            result=result+c;
        }

        System.out.println(result);


        //Recursion


    }
}
