package javainterviewprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class UpWorkInterviewProgram {

    //{Return smallest positive number
    // Input is array of numbers
    // ouput is a int number
    // Condition- smallest positive number that is not present in Integer Array A
    // Number should be greater than zero
    // to do : find the smallest and greatest  number in Array using Treeset
    // output :Inside that range of smallest and greatest number find out the number that is not present
    //if smallest is greater than 1 set the range between 1 to smallest
    // if all the numbers present in the array are negative then return 1
    // output number should be greater than zero
    // }



    public static void main(String[] args) {

        int[] a={1,2,3};// output should be 3

       // int[] a={1,4,3,8};
        int result=solution(a);
        System.out.println("Result "+result);
    }


    public static int solution(int[] A) {
        int smallestNumber=0;
        int largestNumber=0;
        int outputNumber = 0;

        A=removeNegativeNumbers(A);

        Integer[] integerArray = new Integer[A.length];

        int[] finalA = A;
        Arrays.setAll(integerArray, i-> finalA[i]);

        TreeSet tobj = new TreeSet(Arrays.asList(integerArray));

        System.out.println(tobj.toString());

        Object smallObject=tobj.first();

        smallestNumber=(int) smallObject;

        System.out.println("small "+smallestNumber);

        Object largeObject=tobj.last();

        largestNumber=(int) largeObject;

        System.out.println("large "+largestNumber);

        List<Integer> smalllist = new ArrayList<Integer>();
        if(smallestNumber>1)
        {
            for(int j=1;j<=smallestNumber;j++)
            {
                smalllist.add(j);
            }

            System.out.println("small list "+smalllist);

           outputNumber= (int )smalllist.get(0);
        }

        else {

            List<Integer> alist = new ArrayList<Integer>();

            for (int i = smallestNumber; i <= largestNumber; i++) {
                alist.add(i);
            }

            System.out.println("Range list " + alist.toString());

            List<Integer> actuallist = new ArrayList<>();

            actuallist = Arrays.asList(integerArray);


            //actuallist
            //alist=full range

            List finallist = new ArrayList(alist);

            finallist.removeAll(actuallist);

            System.out.println("actuallist " + actuallist);
            System.out.println("alist " + alist);
            System.out.println(finallist);
            outputNumber = (int) finallist.get(0);
            System.out.println(outputNumber);
        }
        return outputNumber;
    }




    private static int[] removeNegativeNumbers(int[] inputArray) {


        List<Integer> alist = new ArrayList<Integer>();

        for(int a:inputArray)
        {
            if(a>0)
            {
                alist.add(a);
            }
        }

        System.out.println(alist.toString());

        int[] resultArray= new int[alist.size()];
        Object[] objectArray=alist.toArray();

        for(int i=0;i<objectArray.length;i++)
        {
            resultArray[i]=(int)objectArray[i];
        }

        System.out.println(Arrays.toString(resultArray));

        // Integer[] array = alist.toArray (new Integer[alist.size()]);

        return resultArray;

    }
}
