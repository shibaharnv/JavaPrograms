package javainterviewprograms.Strings;

public class ArraySequence {

    public static void main(String[] args) {

        int[] a={1,2,3,4,5,6};

        boolean result=sequenceArray(a);

        System.out.println(result);

    }


    public static boolean sequenceArray(int[] inputArr)
    {
        boolean flag=false;

        for(int i=0;i<inputArr.length;i++)
        {

            flag=false;
            for(int j=1;j<inputArr.length;j++)
            {
                if(inputArr[i]+1==inputArr[j])
                {
                    flag=true;
                }
            }
        }

        if(flag)
        {
            System.out.println(" sequence array");
        }

        else {
            System.out.println("Non sequence array");
        }

        return flag;
    }


}
