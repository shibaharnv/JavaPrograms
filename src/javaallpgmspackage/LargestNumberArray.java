package javaallpgmspackage;

public class LargestNumberArray {

    public static void main(String[] args)
    {
        int[] a ={4,2,6,8,5,3,6,8,9,53,33};

        int result =largestNumber(a);

        System.out.println("largest Number "+result);
    }

    public static int largestNumber(int[] myArr)
    {
        int max=myArr[0];

        for(int i=0;i<myArr.length;i++)
        {
            if(myArr[i]>max)
            {
                max=myArr[i];
            }
        }

        return max;
    }
}
