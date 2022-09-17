package javainterviewprograms.Strings.LeetCode;

public class JewelsStones {

    public static void main(String[] args)
    {
        //{Input: jewels = "aA", stones = "aAAbbbb"
        //Output: 3}

        String jewels = "aA";
        String stones = "aAAbbbb";
        int answer=countJewels(jewels,stones);
        System.out.println(answer);
    }

    public static int countJewels(String jewels,String stones)
    {
        char[] jewelsCharArray= jewels.toCharArray();
        char mychar;
        int count;
        int finalCount=0;
        for(int i=0;i< jewelsCharArray.length;i++)
        {
            mychar=jewelsCharArray[i];

           count= stones.replaceAll("[^"+mychar+"]","").length();
           finalCount=finalCount+count;
        }

        return finalCount;
    }
}
