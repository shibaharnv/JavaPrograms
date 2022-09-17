package DataStructureInterview;


import java.util.Arrays;

public class ArrayDataStructure {

    public static void main(String[] args)
    {
       // char[] chararray =['a','b','c'];

        char[] chararray = new char[3];

        chararray[0]='a';
        chararray[1]='b';
        chararray[2]='c';


       int arraylength= chararray.length;

        char[] chararraynew = new char[arraylength+1];

        char newvalue='d';

        for(int i=0;i<chararray.length;i++)
        {
            chararraynew[i]=chararray[i];
        }

        chararraynew[arraylength]= newvalue;

        System.out.println(Arrays.toString(chararraynew));
    }

    // add element to first index of the array



    //Steps:

    //define array having 3 items
    // create a new array with arraylength +1
    // char[] chararray = new char[3];  ['a','b','c']
    //  char[] chararraynew = new char[arraylength+1];
    // char newvalue= 'f'
    //chararraynew[0] =f
    //


}
