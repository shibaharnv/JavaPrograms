package DataStructureInterview;

import java.util.Arrays;

public class MergeTwoarrays {


    public static void main(String[] args) {

        int a[] = { };
        int b[] = {3, 4,5,6};

        int c[] = new int[a.length + b.length];
        int count =0;

        if(a.length==0)
        {
            System.out.println("a is empty"+Arrays.toString(b));
        }

        if(b.length==0)
        {
            System.out.println("b is empty "+Arrays.toString(a));
        }

        for (int i = 0; i < a.length;i++) {

            c[i]=a[i];
            count++;
        }

        for(int j=0;j<b.length;j++)

        {
            c[count]=b[j];
            count++;
        }

        System.out.println(Arrays.toString(c));

    }

}
