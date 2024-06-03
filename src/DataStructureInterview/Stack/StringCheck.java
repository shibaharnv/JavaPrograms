package DataStructureInterview.Stack;

import java.util.ArrayList;
import java.util.Arrays;

public class StringCheck {

    //{String str = "abcsnowhbcdsnowxysnowz";
    // String pat = "snow";}

    public static void main(String[] args) {

        String str = "abcsnowhbcdsnowxysnowz";

        //first find the index of snow and store it as result index
         //as result index
        //Have a variable changing index
        //assing result index value to changingIndex
        //
        //in the first iteration str.index of ("string value",resultIndex+1) capture this value as a changing index
        //in the second iteration str.index of ("string value",changingInxex+1) capture this value as a changing index


          String replacedString= str.replaceAll("snow","1");

        replacedString=replacedString.replaceAll("[^0-9]","");

        System.out.println(replacedString);
        int sum=0;
        for(char c:replacedString.toCharArray())
        {
            int value=Character.getNumericValue(c);
            sum=sum+value;

        }

        System.out.println(sum);


        int resultIndex=str.indexOf("snow");

        ArrayList<Integer> al =new ArrayList<>();
        al.add(resultIndex);

        for(int i=1;i<sum;i++)
        {
            int changinIndex=resultIndex;
            resultIndex=str.indexOf("snow",changinIndex+1);
            al.add(resultIndex);

        }

        System.out.println(al);

        Integer[] integerArray=al.toArray(new Integer[al.size()]);

        System.out.println(Arrays.toString(integerArray));

//
//        System.out.println("resultIndex "+resultIndex);
//
//        int resultIndex1=str.indexOf("snow",resultIndex+1);
//
//        System.out.println("resultIndex1 "+resultIndex1);
//
//
//        int resultIndex2=str.indexOf("snow",resultIndex1+1);
//        System.out.println("resultIndex2 "+resultIndex2);
//
//        String str2="abcdabcdekfgd";
//
//        int index=str2.indexOf("cd");
//
//        System.out.println(index);
//
//        System.out.println("index d first index: "+str2.indexOf('d'));
//
//        System.out.println("index d from 5: "+str2.indexOf('d',4));
//
//        System.out.println("index d from 7: "+str2.indexOf('d',8));
//        String mySubstring=str2.substring(2);
//
//        System.out.println(mySubstring);
//
//        String mySubstring2=str2.substring(1,3);
//
//        System.out.println(mySubstring2);
//
//        String resultString=str.substring(0,4);
//
//
//
//        System.out.println("abc index "+str.indexOf("snow"));
//
//        System.out.println("from index "+str.indexOf("snow",3));
//
//        System.out.println("from index "+str.indexOf("snow",8));
//
//
//
//        System.out.println(resultString);
//        System.out.println(resultString.indexOf('s'));
//
//        System.out.println("test"+resultString.indexOf(resultString,1));
//
//      //  resultString.
//
//        String pat = "snow";
//
//        StringBuffer sb = new StringBuffer(str);
//
//        System.out.println(sb.substring(pat.length()));
//
//
//       String replacedString= str.replaceAll("snow","&");
//
//        System.out.println(replacedString);
//
//        String[] splitString= str.split("snow");
//
//        System.out.println(Arrays.toString(splitString));
//
//        //abc if the character starts with s and followed by now then return the index of s
//
//
//        char[] charArray=str.toCharArray();
//
//       // ArrayList<Integer> al = new ArrayList<>();
//
////        for(int i =0;i<charArray.length;i++)
////        {
////            char c=charArray[i];
////
////            if(c=='s')
////            {
////                charArray[i+1]='n';
////               charArray[i+2]='o';
////               charArray[i+1]='w';
////                al.add(i);
////            }
//
//         Character[] characterArray= new Character[charArray.length];
//         Arrays.setAll(characterArray,i->charArray[i]);
//
//        ArrayList<Character> al = new ArrayList<>(Arrays.asList(characterArray));
//
//        for(int j=0;j<al.size();j++)
//        {
//
//          Character c=al.get(j);
//
//            if(c=='s')
//            {
//
//
//            }
//
//        }

 //url in excel
  //copy to device or emulator


    }
}
