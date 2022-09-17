package javainterviewprograms.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class StringsOneEditAwayRetest {

    //{Input two strings - one edit away
    // 1.Three operations permitted 1. change the character ,2 . add a character, 3 .deleted a character}

    public static void main(String[] args) {
        String s1 = "abdckey";
        String s2 = "adbcvtwertwert";

        // write a function to check if the given two strings are one edit away for making it equal

        //{logic :
        // Input two strings
        // Output true or false
        // first we need to sort the strings
        // inorder to sort it first change that to character array and then put it in tree set which impleements sorted sets}

        oneEditAway(s1,s2);
    }

        public static void oneEditAway(String st1,String st2)
        {

            char[] charArray1=st1.toCharArray();
            char[] charArray2=st2.toCharArray();


            //Wrapper class
            Character[] characterArray1= new Character[charArray1.length];
            Character[] characterArray2= new Character[charArray2.length];


            // assigning values
            Arrays.setAll(characterArray1,i->charArray1[i]);
            Arrays.setAll(characterArray2,i->charArray2[i]);

            TreeSet ts1= new TreeSet(Arrays.asList(characterArray1));
            TreeSet ts2= new TreeSet(Arrays.asList(characterArray2));

            System.out.println(ts1);
            System.out.println(ts2);

            int setSize1=ts1.size();

            int setSize2=ts2.size();

           // int diff=setSize1-setSize2;
            int diff=0;
            if(setSize2>setSize1)
            {
                 diff=setSize2-setSize1;

                if(diff>1)
                {
                    System.out.println("Not one edit");
                }

                else if(diff==1)
                {
                    System.out.println(" one edit");
                }
            }

            else

            {

                diff=setSize1-setSize2;

                if(diff>1)
                {
                    System.out.println("Not one edit");
                }

                else if(diff==1)
                {
                    System.out.println(" one edit");
                }

            }


            System.out.println(diff);




        }
}