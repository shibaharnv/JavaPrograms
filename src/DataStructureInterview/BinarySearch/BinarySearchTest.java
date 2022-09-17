package DataStructureInterview.BinarySearch;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class BinarySearchTest {

public static void main(String[] args)
{

    int[] a= {10,30,70,60,50,40};

    int[] b= {2, 3, 5, 7, 8, 10, 12, 15, 18, 20};

    //first we need to sort an array.
    //inorder to sort an array we can convert the array into Integer array and put that array into Sorted Set
    // then we can use the set elements and found the element
    //Check if 50 is present in the array.

    Integer[] aInteger= new Integer[a.length];

    Arrays.setAll(aInteger,i->a[i]);

    SortedSet sobj = new TreeSet(Arrays.asList(aInteger));

    System.out.println("Sorted set "+sobj);

    if(sobj.contains(50))
    {
        System.out.println("Element is present");
    }

    else
    {
        System.out.println("Element is not present");
    }

    binarySearch(b,33);

}


        public static void binarySearch(int[] myarr,int answer)
        {

            int firstNumber= myarr[0];

            int lastNumber= myarr[myarr.length-1];

            int middleNumber;

            while (firstNumber<=lastNumber)
            {
                middleNumber=(firstNumber+lastNumber)/2;

                if(answer==middleNumber)
                {
                    System.out.println("Answer found "+middleNumber);
                    break;
                }
                else if(answer>middleNumber)
                {
                    firstNumber=middleNumber+1;
                }
                if(answer<middleNumber)
                {
                    lastNumber=middleNumber-1;
                }


            }
            if(firstNumber>lastNumber)
            {
                System.out.println("Number not found");
            }

        }


}
