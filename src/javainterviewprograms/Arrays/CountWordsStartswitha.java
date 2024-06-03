package javainterviewprograms.Arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class CountWordsStartswitha {

    public static void main(String[] args) {



        ArrayList<String> al = new ArrayList();
        al.add("abc");
        al.add("bcd");
        al.add("akd");
        al.add("Add");
        al.add("Add");
        //{count the number of elements in the array list that starts with letter a}

        int count=0;

        for(String s:al)
        {
            char c=s.charAt(0);

            if (c=='a'||c=='A')
            {
                count++;
            }
        }

        System.out.println(count);
    }
}
