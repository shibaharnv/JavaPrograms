package DataStructureInterview.BinarySearch;

public class BinarySearchBasic {

    public static void main(String[] args) {

        //Search for an element and return index

        int[]   a={1,2,3,4,5};
        int element= 6;
        int result=binarySearchReturnIndex(a,element);
        System.out.println(result);
    }

    private static int binarySearchReturnIndex(int[] a, int target) {
        int p=0;
        int r=a.length-1;
        int q;

        while (p<=r)
        {
            q=(p+r)/2;

            if(target==a[q])
            {
                return q;
            }
            else if (target<a[q])
            {
                r=q-1;

            }
            else if(target>a[q])
            {
                p=q+1;
            }


        }



        return -1;
    }


}
