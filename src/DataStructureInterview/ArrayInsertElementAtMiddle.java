package DataStructureInterview;

import java.util.Arrays;

public class ArrayInsertElementAtMiddle {

    public static void main(String[] args)
    {
        //insert element at a the specific index and retain other elements
       // increase the length of the array by 1
       //find out the position and insert element
        //if second position then add b
        //Output =['a','b','c','d']
        //insert at position 1,value is b
        //input values position,value

        char[] chararray = new char[3];
        chararray[0]='1';
        chararray[1]= '3';
        chararray[2]='4';


        ArrayInsertElementAtMiddle obj = new ArrayInsertElementAtMiddle();
        char[] resultarray =obj.addElementAtArray(1,'2',chararray);

        System.out.println("Result array"+Arrays.toString(resultarray));


    }

    char[] addElementAtArray(int pos, char value, char[] inputarray)
    {
        char[] chararraynew = new char[inputarray.length+1];

        for(int i=0;i<pos;i++) {

            chararraynew[i]= inputarray[i];
            chararraynew[pos]=value;
        }

        for(int j=pos +1;j<chararraynew.length;j++)
        {
            chararraynew[j]=   inputarray[j-1];
        }

        System.out.println(Arrays.toString(chararraynew));

        return chararraynew;
    }
}
