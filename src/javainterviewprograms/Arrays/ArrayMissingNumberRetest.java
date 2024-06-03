package javainterviewprograms.Arrays;

public class ArrayMissingNumberRetest {

    public static void main(String[] args) {

        int[] a={1,2,4};
        System.out.println(findMissingNumber(a));
    }


    public static int findMissingNumber(int[] inputArray)
    {

        int missingNumber=0;
        int actualSum=0;
        int expectedSum=0;

        //find actual sum

      for(int a:inputArray)
      {
          actualSum=actualSum+a;
      }

      //find expectedsum

        for(int i=inputArray[0];i<=inputArray[inputArray.length-1];i++)
        {
            expectedSum=expectedSum+i;
        }

//        for(int i=1;i<=4;i++)
//        {
//            expectedSum=expectedSum+I;
//        }

        missingNumber=expectedSum-actualSum;

        return missingNumber;
    }
}
