package DataStructureInterview;

import java.util.Arrays;

public class BigONotationOofOne {

    public static void main(String[] args)

    {


        String[] testarray = new String[50];

        Arrays.fill(testarray,"nemo");

        BigONotationOofOne obj = new BigONotationOofOne();

        obj.getvalue(testarray);
    }


    public void getvalue(String[] testarray)
    {
        System.out.println(testarray[1]);

    }



}
