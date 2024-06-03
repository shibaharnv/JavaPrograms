package DataStructureInterview;

import java.util.ArrayList;
import java.util.Arrays;

public class AnagaramCharacterDeletions {

    public static void main(String[] args) {

        //{input two string
        //     //cde
        //        //abc
        //        if string lengths are equal sort it and  add it to list }

        String s1 = "fcrxzwscanmligyxyvym";
        String s2 = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
        System.out.println(AnagaramCharacterDeletionsMethod(s1, s2));


    }

    private static int AnagaramCharacterDeletionsMethod(String a, String b) {

        ArrayList<Character> altes1= new ArrayList<Character>();
        altes1.add('a');
        altes1.add('b');
        altes1.add('b');
        altes1.add('c');
        ArrayList<Character> altes2= new ArrayList<Character>();
        altes2.add('k');
        altes2.add('b');
        altes2.add('b');
        altes2.add('c');

     altes1.removeAll(altes2);
        System.out.println("test"+altes1);
        char[] cArray1 = a.toCharArray();
        char[] cArray2 = b.toCharArray();

        Arrays.sort(cArray1);
        Arrays.sort(cArray2);
        System.out.println(cArray1);
        System.out.println(cArray2);

        Character[] characterArray1= new Character[cArray1.length];
        Character[] characterArray2= new Character[cArray2.length];

        Arrays.setAll(characterArray1,i->cArray1[i]);
        Arrays.setAll(characterArray2,i->cArray2[i]);

        System.out.println(Arrays.toString(characterArray1));
        System.out.println(Arrays.toString(characterArray2));


        ArrayList<Character> al1= new ArrayList<Character>(Arrays.asList(characterArray1));
        ArrayList<Character> al2= new ArrayList<Character>(Arrays.asList(characterArray2));
        System.out.println(al1);
        System.out.println(al2);



        int deletionCount=-1;
        int firsLength = a.length();
        int secondLength = b.length();
        int diff = 0;
        if (firsLength > secondLength) {
            diff = firsLength - secondLength;
        } else {
            diff = secondLength - firsLength;
        }



        if (firsLength != secondLength) {

//
//            Character[] characterArray1= new Character[cArray1.length-1];
//            Character[] characterArray2= new Character[cArray2.length-1];

            ArrayList<Character> rmal= new ArrayList<Character>(al1);
            ArrayList<Character> rma2= new ArrayList<Character>(al2);

            System.out.println("before"+rmal);
            rmal.removeAll(al2);
            System.out.println(rmal);
            rma2.removeAll(al1);
            deletionCount=rmal.size()+rma2.size();
            // deletionCount= rmal.size();
        }

        if (firsLength == secondLength) {

//
//            Character[] characterArray1= new Character[cArray1.length-1];
//            Character[] characterArray2= new Character[cArray2.length-1];

            ArrayList<Character> rmal= new ArrayList<Character>(al1);
            ArrayList<Character> rma2= new ArrayList<Character>(al2);

            System.out.println("before"+rmal);
            rmal.removeAll(al2);
            System.out.println(rmal);
            rma2.removeAll(al1);
            deletionCount=rmal.size()+rma2.size();
            // deletionCount= rmal.size();
        }

        return deletionCount ;
    }
}
