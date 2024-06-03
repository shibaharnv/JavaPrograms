package javainterviewprograms.Arrays;

import java.util.Arrays;

public class ArrayRightRotateStudy {

    public static void main(String[] args) {

        int[] a={1,2,3};



        //{Store the last element finally it should be assigned to a[0]
        // a[lastelemt-1]=a[lastelemt-2]
        // a[2]=a[1]
        // a[1]=a[0]
        // }
        int rotation=2;
        int k=1;
        while(k<=rotation) {
            int lastElement=a[a.length-1];
            for (int i = a.length - 1; i > 0; i--) {
                a[i] = a[i - 1];

            }
            a[0] = lastElement;
            k++;
        }

        System.out.println(Arrays.toString(a));

        String result="";

        for(int e:a)
        {
            result=result+e;
        }

        System.out.println(result);

        char[] charArray=result.toCharArray();

        String test="";
//        for(char c :charArray)
//        {
//            test=test+c;
//
//            test=test.concat(" ");
//        }

        for(int j=0;j<charArray.length;j++)
        {
            test=test+charArray[j];
            test=test.concat(" ");

         if(j==charArray.length-1)
         {
            break;
         }



        }

        System.out.println(test);



    }
}
