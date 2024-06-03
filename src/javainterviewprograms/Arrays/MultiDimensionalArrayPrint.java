package javainterviewprograms.Arrays;

import JavaStudy.Streams.SortArrayStream;

public class MultiDimensionalArrayPrint {

    public static void main(String[] args) {
        //{1       2
        //6       7
     //  0  1  2
 // 0 -->1  2  4
 // 1 --->6  7  9
 // 2 --->3  5  10

 //o/p -->4,9,10,5,7,2,1,6,3

        //a[0][2]
        //a[1][2]
        //a[2][2]


        //a[2][1]
        //a[1][1]
        //a[0][1]

        //a[0][0]
        //a[1][0]
        //a[2][0]

        //Using for loop using length of array we can set the column value
        //Adjusting row value for 1st iteration row value 0,1,2
        //2nd iteration 2,1,0
        //3rd iteration 0,1,2
                         //cb   //cend
                    //     0  1  2
        //(rowBegin) 0 --> 1  2  4
        //           1 --->6  7  9
        //(rowEnd)   2 --->3  5  10


        int[][] a={{1,2,4},{6,7,9},{3,5,10}};


        int rowBegin=0;
        int rowEnd=a.length-1;
        int colBegin=0;

        int colEnd=2;




        //Print Top To bottom //4,9,10

    for(int k=rowBegin;k<rowEnd;k++)
    {
       System.out.print(a[k][colEnd]);
       System.out.print(",");
    }

    colEnd--;



    //Print bottom to top 5,7,2 -->[2][1] [1][1] [0][1]



        for(int g=a.length-1;g>=0;g--)
        {
            System.out.print(a[g][colEnd]);
            System.out.print(",");
        }
        colEnd--;

        //[0][0] [0][1]  [0][2]
        for(int k=0;k<a.length;k++)
        {
            System.out.print(a[k][colEnd]);
            if(k!=a.length-1)
            {System.out.print(",");}

        }




//        for(int i=a.length-1;i>=0;i--)
//        {
//            for(int j=0;j<a.length;j++)
//            {
//                System.out.print(a[j][i]);
//                System.out.print(",");
//            }
//        }





    }
}
