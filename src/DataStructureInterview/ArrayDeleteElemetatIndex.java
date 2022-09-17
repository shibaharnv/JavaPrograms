package DataStructureInterview;


import java.util.Arrays;

public class ArrayDeleteElemetatIndex {

    public static void main(String[] args)

    {
        int[] array1= new int[4];

        array1[0] =1;
        array1[1] =0;
        array1[2] =2;
        array1[3] =3;

        System.out.println(Arrays.toString(array1));

        deletElementAtIndex(1,array1);
        // Delete index 1 from array 1
        //input values array and index value
        //if index value is 1

       // inputarray ={1,0,2,3}
        //O/p array ={1,2,3}

        //new array={new[i] =input[i]
        //   new[0] =input[0]
        //   new[1] =delete
        //  new[1] =input[2]
        //  new[2] =input[3]
        // loop -input array
        //   if i value not equal to index

        //   }
    }


     static void deletElementAtIndex(int index,int[] inputarray)
    {

        int[] newarray = new int[inputarray.length-1];

        for(int i=0,k=0;i<inputarray.length;i++)
        {
            if(i!=index)
            {
                newarray[k++] = inputarray[i];
            }

            else
            {
              continue;
            }
        }

        System.out.println(Arrays.toString(newarray));


    }



}
