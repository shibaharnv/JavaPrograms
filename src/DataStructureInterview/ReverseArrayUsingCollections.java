package DataStructureInterview;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayUsingCollections {

    /*function reverses the elements of the array*/
     void reverse(Integer a[])
    {
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }

    public static void main(String[] args)
    {
        Integer [] arr = {10, 20, 30, 40, 50};

        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.asList(arr));

        ReverseArrayUsingCollections obj = new ReverseArrayUsingCollections();
        //obj. reverse(arr);
    }
}
