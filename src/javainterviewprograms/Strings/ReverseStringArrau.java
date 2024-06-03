package javainterviewprograms.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseStringArrau {

    public static void main(String[] args) {

        String[] strArray= {"test","good","nice"};

        List<String> strList= new ArrayList<>();

        System.out.println(Arrays.toString(strArray));

        for(int i=strArray.length-1;i>=0;i--)
        {
            strList.add(strArray[i]);
        }

        System.out.println(strList);

        String[] resultArray=strList.toArray(new String[strList.size()]);

        //String[] resultArray=strList.toArray(new String[strList.size()]);

        System.out.println(Arrays.toString(resultArray));
    }

}
