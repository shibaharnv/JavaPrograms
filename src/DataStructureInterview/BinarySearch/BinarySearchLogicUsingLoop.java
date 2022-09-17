package DataStructureInterview.BinarySearch;

public class BinarySearchLogicUsingLoop {

    public static void main(String[] args)
    {
        int[] a ={1,2,3,4,5,6,7,8,9,10};
        int firstNumber=a[0];
        int lastNumber=a[a.length-1];
        int midNumber;
        int answer=11;

        while (firstNumber<=lastNumber)
        {
            midNumber=(firstNumber+lastNumber)/2;
            System.out.println("middle Number "+midNumber);

            if(midNumber==answer)
            {
                System.out.println("midNumber Answer found "+midNumber );
                break;
            }
            else if(answer>midNumber)
            {
                firstNumber=midNumber+1;
            }

            if(answer<midNumber)
            {
                lastNumber=midNumber-1;
            }

        }
        if(firstNumber>lastNumber)
        {
            System.out.println("Number not found");
        }




    }
}
