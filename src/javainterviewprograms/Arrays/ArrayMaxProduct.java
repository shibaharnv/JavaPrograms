package javainterviewprograms.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayMaxProduct {

    public static void main(String[] args) {


        int[] a={3,5,2,6,8};

        System.out.println(maxProduct(a));

        System.out.println(compare(a));
        int max=8;
        secondLargestInArray(a,max);
    }

    //{i/p is array and output is int
    // we need to find the maximum product of any time elements
    // Sort the array using collections
    // take the last two elements mulitple it and return it}

    //{1,3,5,4}
    //{Using compare Method :
    // Iterate throw the array
    // assume first element is max
    // compare the first elemetnt with next element if the nex element is greate than first element change the max value to next element.
    // max=a[0]
    // if(a[1]>max-->max=a[1])
    //   a[2>]>a[1]--->}

    //{1,2,3}


    public static int maxProduct(int[] a)
    {

        Integer[] integerArray= new Integer[a.length];

        Arrays.setAll(integerArray,i->a[i]);

        List<Integer> list= new ArrayList<>(Arrays.asList(integerArray));

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        int lastElement=list.get(list.size()-1);
        int secondLastElement=list.get(list.size()-2);

        int maxNumber= lastElement*secondLastElement;

        return maxNumber;
    }



    public static int compare(int[] a)
    {

        int max=a[0];
        for(int i=1;i<a.length;i++)
        {

            if(a[i]>max)
            {
                max=a[i];
            }

        }
        return max;

    }

    public static void secondLargestInArray(int[] a,int max)
    {
//find out the largest number
        //3-1=2
        //store it as small value
        //3-2=1

        int secondLargest=a[0];
        for(int i=0;i<a.length;i++)
        {
            int subValue=max-secondLargest;
           // if(max)
        }


    }
}
