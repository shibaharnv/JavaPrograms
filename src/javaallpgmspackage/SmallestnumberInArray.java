package javaallpgmspackage;

public class SmallestnumberInArray {

    public static void main(String[] args)
    {
        int[] a ={4,2,6,8,5,3,6,8,9,53,33};

        System.out.println("smallest number is " +smallestNumber(a));
    }

    public static int smallestNumber(int[] myArray) {

        int min=myArray[0];

        for(int i=0;i<myArray.length;i++)
        {
            if(myArray[i]<min)
            {
                min= myArray[i];
            }

        }

        return min;
    }
}
