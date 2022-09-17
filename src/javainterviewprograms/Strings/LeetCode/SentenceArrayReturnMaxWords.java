package javainterviewprograms.Strings.LeetCode;

import java.util.ArrayList;
import java.util.Collections;

public class SentenceArrayReturnMaxWords {

    //{sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]}

    public static void main(String[] args)
    {
        //{Input Sentence Array
        // output -Return the (count) maximum number of words count from the array
        // find the first element in the array and coun the number of spaces
        // no of spaces +1 = words count count
        // Iterate through the array and find the count and put it in integer array}

        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        String[] Singlesentence;
        int value;
        ArrayList<Integer> al= new ArrayList<Integer>();
        for(int i=0;i<sentences.length;i++)
        {
            Singlesentence=sentences[i].split("\\W+");
            value =Singlesentence.length;
            al.add(value);
        }

        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        System.out.println(al.get(al.size()-1));
        //al.get(al.size()-1);
    }
}
