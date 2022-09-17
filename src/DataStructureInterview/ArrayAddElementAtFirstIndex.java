package DataStructureInterview;

import java.util.Arrays;

public class ArrayAddElementAtFirstIndex {

    public static void main(String[] args) {

        //Steps:

        //define array having 3 items
        // create a new array with arraylength +1
        // char[] chararray = new char[3];  ['a','b','c']
        //  char[] chararraynew = new char[arraylength+1];
        // char newvalue= 'f'
        //chararraynew[0] =f

        char[] chararray = new char[3];

        chararray[0]='a';
        chararray[1]='b';
        chararray[2]='c';

        char[] chararraynew = new char[chararray.length+1];

        chararraynew[0] ='f';

        for(int i=1;i<chararraynew.length;i++)
        {
            chararraynew[i]=chararray[i-1];
        }
            chararraynew[2]='x';
        System.out.println(Arrays.toString(chararraynew));

    }


}
