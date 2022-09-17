package javainterviewprograms.NaveenTrickyCodeQuestions;

import java.util.HashMap;
import java.util.Map;

public class ArrayDuplicatesUsingHashMap {

    public static void main(String[] args) {

        String[] myarr= {"amazon","fb","amazon","google"};

        HashMap<String,Integer> hm = new HashMap<String,Integer>();



        for(int i=0;i<myarr.length;i++)
        {
            int count=1;
            if(hm.containsKey(myarr[i]))
            {
                hm.put(myarr[i],count=count+1);
            }
            hm.put(myarr[i],count);
        }

        System.out.println(hm.entrySet());

                for(Map.Entry<String,Integer> entry :hm.entrySet())
                {

                    if(entry.getValue()>1)
                    {
                        System.out.println("Duplicate Value is  " +entry.getKey());
                    }
                }

    }
}
