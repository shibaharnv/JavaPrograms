package javainterviewprograms.Arrays;

public class ArrrayMissingNumbers {
    public static void main(String[] args) {


        int[] a={0,2,3,4,5};

        //{Find missing number
        // a[3]-a[2]>1
        // a[2]-a[1]>1
        // a[1]-a[0]>1}

        int count=0;
        int value=0;
        for(int i=a.length-1;i>0;i--)
        {
            if(a[i]-a[i-1]>1)
            {
                count ++;

                value=a[i-1];
                value=value+1;
                System.out.println("missing number is "+value);
            }

        }

        if(count==0)
        {
            System.out.println("No missing numbers");
        }
    }

}
