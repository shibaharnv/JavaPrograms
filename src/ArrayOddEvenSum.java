public class ArrayOddEvenSum {

    public static void main(String[] args)
    {
        int[] a={4,7,5,9,6};

        //{Find sum of odd and even numbers in the array
        // 1. Find the even numbers using Modulas 2
        // 2. Two integers odd summ and even sum }
        int oddSum=0;
        int evenSum=0;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                evenSum=evenSum+a[i];
            }

            else
            {
                oddSum=oddSum+a[i];
            }
        }

        System.out.println("oddsum "+oddSum);
        System.out.println("even sum "+evenSum);
    }
}
