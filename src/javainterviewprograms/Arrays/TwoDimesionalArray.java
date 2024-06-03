package javainterviewprograms.Arrays;



public class TwoDimesionalArray {

    public static void main(String[] args) {

        int[] a={11,21,3};
     //   int min=a[0];
//        for(int i=0;i<a.length;i++)
//        {
//            if(a[i]<min)
//            {
//                min=a[i];
//            }
//
//        }
     //   System.out.println("min number is "+min);

        int[][] b={{1,2},{3,4}};
        //     0 1
        // 0 --1 2
        // 1-- 3 4

        //{Assume min =[0][0]
        //   [0][1]
        //   [1][0]
        //   [1][1]}


        int min=b[0][0];
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                //System.out.print(b[i][j]);

                if(b[i][j]<min)
                {
                    min=b[i][j];
                }
            }
        }



        System.out.println(min);

        //System.out.println(b.length);

//        for(int k=0;k<b.length;k++)
//        {
//            int min=b[0][0];
//            for(int i=0;i<a.length;i++)
//            {
//                if(a[i]<min)
//                {
//                    min=a[i];
//                }
//
//            }
//        }


        //    0   1
        //0->[1] [2]
        //1->[3] [4]
   //00 01
        //[0]+[0]  +[0][1]
       // [//00 +11

        //In two dimensinal array row is the length
//            int[][] b={{1,2},{3,4}};
//          System.out.println(b.length);
//
//        int sum=0;
//
//        for(int i=0;i<b.length;i++)
//        {
//
//          sum=sum+  a[1][i];
//
//        }
//
//        System.out.println(sum);


    }
}
