package DataStructureInterview.Maps;

import java.util.HashMap;

public class CommonSubString {


    public static void main(String[] args) {



        String s1= "bc";
        String s2="akf";
        String result=twoStrings(s1,s2);
        System.out.println(result);
//        if(twoStrings(s1,s2)){
//            System.out.println("substring is present");
//        }
//        else {
//            System.out.println("Substring not present");
//        }






//
//
//        System.out.println(hm1);
//        System.out.println(hm2);
//
//       Set hm1KeySet=hm1.keySet();
//        Set hm2KeySet=hm2.keySet();
//
//        HashSet<Character> combinedKeys= new HashSet<>(hm1KeySet);
//        combinedKeys.addAll(hm2KeySet);
//        System.out.println("combinedKeys "+combinedKeys);
//        System.out.println(combinedKeys.removeAll(hm2.keySet()));
//        System.out.println(combinedKeys);
//
//
//        return false;

    }

    private static String twoStrings(String s1, String s2) {

        String positiveResult="YES";
        String NEGATIVEResult="NO";

        char[] charr1=s1.toCharArray();
        char[] charr2=s2.toCharArray();

        HashMap<Character,Integer> hm1= new HashMap<>();
        HashMap<Character,Integer> hm2= new HashMap<>();

        int count=0;

        for(char c:charr1)
        {
            if(!hm1.containsKey(c))
            {
                hm1.put(c,1);

            }
            else {
                hm1.put(c, hm1.get(c)+1);
            }

        }


        for(char c:charr2)
        {
            if(!hm2.containsKey(c))
            {
                hm2.put(c,count=1);

            }
            else {
                hm2.put(c,count+1);
            }

        }
        System.out.println(hm1);
        System.out.println(hm2);

        for(char key:hm1.keySet())
        {

            if(hm2.containsKey(key))
            {

                return positiveResult;
            }

        }

        return NEGATIVEResult;

    }
}
