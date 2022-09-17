package DataStructureInterview;

public class ArrayLargestNumber
{

    public static void main(String[] args) {

        int a[] = {43,54,644523,24,3,3242,};


        int max =   a[0];

        for(int i=0;i<a.length;i++)
        {
            if(a[i]>a[0])
            {
                max=a[i];
                a[0]=max;
            }
        }

        System.out.println("max value is "+max);
    }


}
