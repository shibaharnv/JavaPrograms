package DataStructureInterview;

public class ArraySecondLargestNumber {

    public static void main(String args[]) {

        int[] array1 = {100,1400,800,300};

//        array1[0] = 55;
//        array1[1] = 35;
//        array1[2] = 15;

        //{Take the first two elements and find the  first largest and second largest
        // for the remaining elements do  forloop

        // }
            int firstlargest;
            int secondlargest;

            if(array1[0]>array1[1])
            {
                firstlargest =array1[0];
                secondlargest=array1[1];
            }

            else
            {
                firstlargest =array1[1];
                secondlargest=array1[0];
            }

            for(int i=2;i<array1.length;i++)
            {
                if(array1[i]>firstlargest)
                {
                    secondlargest =firstlargest;
                    firstlargest=array1[i];
                }

                else {
                    if(array1[i]<firstlargest  && array1[i]>secondlargest)
                    {
                        secondlargest=array1[i];
                    }
                }
            }

        System.out.println("Second largest "+secondlargest);
    }

}
