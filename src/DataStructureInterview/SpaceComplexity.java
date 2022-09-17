package DataStructureInterview;

import java.util.Arrays;

public class SpaceComplexity {

    public static void main(String[] args)
    {
        SpaceComplexity obj = new SpaceComplexity();

        String[] hiarr = {"abc","ecd","erf"};
        obj.arrayFunction(hiarr);
        obj.arrayhitimes(5);

        String[] twitterarray = {"firsttweet","midtweet","recenttweet"};
        obj.twitterFunction(twitterarray);
    }

    void arrayFunction(String[] myarr)
    {
        for(int i=0;i<myarr.length;i++)
        {
            System.out.println("hi");
        }
    }

    String[] arrayhitimes(int n)
    {
        String[] hiarray = new String[n];

        for(int j=0;j<n;j++)
        {
            hiarray[j] ="hi";
        }
        System.out.println(Arrays.toString(hiarray));

        return hiarray;
    }


    //Twitter function to get the recent and first tweet.

    void twitterFunction(String[] twitterarrayinput)
    {
        System.out.println("recent tweet"+twitterarrayinput[twitterarrayinput.length-1]);
        System.out.println("first tweet"+twitterarrayinput[0]);
    }
}


//o/p{"hi","hi","hi"}