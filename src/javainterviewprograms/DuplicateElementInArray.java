package javainterviewprograms;

public class DuplicateElementInArray {


    public static void main(String[] args) {

        int[] a={1,3,4,5,6};
        boolean flag = false;

        for(int i=0;i< a.length;i++)
        {
            for(int j=i+1;j< a.length;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.println("Element found "+a[i]);
                    flag=true;
                }
            }
        }

        if(flag) {
            System.out.println("Duplicates found");
        }

        else {
            System.out.println("Duplicates not found");
        }
    }
}
