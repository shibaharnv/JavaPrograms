package DataStructureInterview;

import java.util.Arrays;

public class Swaptwovlauesinarray {

    public static void main(String[] args) {

        int a[] =new int[2];
        a[0]=3;
        a[1]=1;

        int temp;

        temp=a[0];
        a[0]=a[1];
        a[1]=temp;

        System.out.println(Arrays.toString(a));


    }
}
