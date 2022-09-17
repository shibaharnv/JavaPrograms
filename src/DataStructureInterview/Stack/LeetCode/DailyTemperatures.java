package DataStructureInterview.Stack.LeetCode;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {

  //{Given an array of integers temperatures represents the daily temperatures,
    // return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature.
    // If there is no future day for which this is possible, keep answer[i] == 0 instead.}

    //{first add all the elements to stack
    // Compare stackarray[i]<stackarray[i+1] push 1 to new stackarray
    // }

    public static void main(String[] args)
    {
      //  int[] inputtemperatures= {10,20,30,15,40};

        int[] inputtemperatures= {73,74,75,71,69,72,76,73};


        Stack<Integer> finalstackarray=   dailyTemperaturesMethod(inputtemperatures);

       System.out.println(finalstackarray.toString());
    }

    public  static Stack<Integer> dailyTemperaturesMethod(int[] temperatures)
    {

        Stack<Integer> firststackarray = new Stack<Integer>();
        Stack<Integer> secondstackarray = new Stack<Integer>();
        int count=1;
        for(int i=0;i<temperatures.length;i++)
        {
            firststackarray.push(temperatures[i]);
        }

        for(int j=0; j<firststackarray.size()-1;j++)
        {
            int temp=0;

            if(firststackarray.get(j)< firststackarray.get(j+1))
            {
                secondstackarray.push(1);
                continue;
            }

            else
            {
                count++;
                temp=count;
                continue;


            }

        }

        secondstackarray.push(count);
        secondstackarray.push(0);

        return secondstackarray ;
    }
}
