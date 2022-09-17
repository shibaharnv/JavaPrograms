package DataStructureInterview.Recursion;

public class ReverseStringUsingRecursion {

    public static void main(String[] args) {
        String word = "abcd";

        //{Two inputs
        //    word.charAt(3)
        //    word.charAt(2)
        //    word.charAt(1)
        //    word.charAt(0)
        //    result = result +word.charAt(n)   }

        String ans =reverseRecursion(word, word.length());

        System.out.println(ans);

    }

    public static String reverseRecursion(String inputWord, int wordlength) {

        String result = "";
        if (wordlength == 0) {
            return null;
        } else {

            result =result+inputWord.charAt(reduceByOne(0));
            return result;
        }


    }

    public static int reduceByOne(int n)

    {

        if(n<=2)
        {
           return reduceByOne(n+1);

        }

        else {
            return 1;
        }


    }
}

