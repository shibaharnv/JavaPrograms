package javainterviewprograms.NlInterviewPreparation.Numbers;

import java.util.ArrayList;
import java.util.List;

public class FibinocciUsingArrayList {

    public static void main(String[] args) {

        int first=0;
        int second=1;

        int number=17;
        fibinocciNUmbers(first,second,number);
    }

    public static void fibinocciNUmbers(int first,int second,int number)
    {
        List al = new ArrayList();
        al.add(first);
        al.add(second);

        for(int i=2;i<number;i++)
        {
            int prev=(int)al.get(i-1); //1
            int newValue=(int)al.get(i-2);//0
            al.add(prev+newValue);

        }
        System.out.println(al);

    }
}
