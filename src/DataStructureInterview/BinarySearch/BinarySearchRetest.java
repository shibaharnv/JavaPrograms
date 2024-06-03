package DataStructureInterview.BinarySearch;

public class BinarySearchRetest {

    public static void main(String[] args) {

        //{Binary Search sorted array
        // firsteelemt,last,mid=fist+last/2
        // ifmid=x --> return x and break
        // if mid >x --> first=mid
        // if mid <xlast=mid}


        int[] a={10,20,30,40,50};

        int target=20;

        int first=a[0];
        int last=a[a.length-1];

        while (first<=last)
        {

            int mid=(first+last)/2;

            if(mid==target)
            {
                System.out.println("Answer found "+mid);
                break;
            }
            if(target<mid)
            {
                last=mid-1;
            }

            if(target>mid)
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
