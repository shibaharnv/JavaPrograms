package DataStructureInterview;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArray {

    public static void main(String[] args)
    {
        int[] a = {1,2,1};

        a[2]=3;

        Set s = new HashSet();

        for (int name : a)

        {
            if (s.add(name) == false) {

                System.out.println("Contains duplicate element "+name);// your duplicate element }
            }
                // Read more: https://javarevisited.blogspot.com/2015/06/3-ways-to-find-duplicate-elements-in-array-java.html#ixzz6yRjNG9hc

            }
        }

    }

//        for(int i=0;i<a.length;i++)
//        {
//            Set s = new HashSet();
//
//
//            if(s.add(a[i])==false)
//            {
//                System.out.println("Given number contain duplicates");
//            }