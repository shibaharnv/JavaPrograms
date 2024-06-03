package javainterviewprograms.Arrays;

import java.util.HashMap;

class Isomorphic {
    public static boolean isIsomorphic(String s, String t) {

        char[] firstCharArray=s.toCharArray();
        char[] secondCharArray=t.toCharArray();

        HashMap<Character,Character> hm= new HashMap();




            for(int i=0;i<secondCharArray.length;i++)
            {
                if(firstCharArray[i]==secondCharArray[i] ||firstCharArray[i]!=secondCharArray[i])
                {

                    if(hm.containsKey(firstCharArray[i]))
                    {

                        if(!hm.get(firstCharArray[i]).equals(secondCharArray[i]))
                        {
                            return  false;
                        }
                        else
                        {
                            return true;
                        }

                    }
                    hm.put(firstCharArray[i],secondCharArray[i]);
                }
            }


        return false;
    }







    public static void main(String[] args)
    {
        String s="foo";
        String t="bar";

        System.out.println(isIsomorphic(s,t));
    }
}