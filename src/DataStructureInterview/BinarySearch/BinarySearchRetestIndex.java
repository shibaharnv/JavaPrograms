package DataStructureInterview.BinarySearch;

public class BinarySearchRetestIndex {

    public static void main(String[] args) {

        //{Binary Search sorted array
        // firsteelemt,last,mid=fist+last/2
        // ifmid=x --> return x and break
        // if mid >x --> first=mid
        // if mid <xlast=mid}


        int[] a={10,20,30,40,50};

        int target=30;

        int first=0;
        int last=a.length-1;

        while (first<=last)
        {

            int mid=(first+last)/2;

            if(a[mid]==target)
            {
                System.out.println("Answer found at index "+mid);
                break;
            }
            if(target<a[mid])
            {
                last=mid-1;
            }

            if(target>a[mid])
            {
                first=mid+1;
            }
        }

        if(first>last)
        {
            System.out.println("number not found");
        }
    }
}
