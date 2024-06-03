package javainterviewprograms.Arrays;

public class SprialArray {

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

    //output : 1,2,4, 9,10, 5,3   ,6,7
        int[][] a={{1,2,4},{6,7,9},{3,5,10}};


        int rowBegin=0;
        int rowEnd=a.length-1;
        int colBegin=0;

        int colEnd=a[0].length-1;

        //lefttoRight   -->1,2,4, -->  [0][0] [0][1] [0][2]


        while (rowBegin<=rowEnd && colBegin<=colEnd) {
            for (int i = colBegin; i <= colEnd; i++) {
                System.out.print(a[rowBegin][i]);
                System.out.print(",");
            }
            rowBegin++;

            //toptoBottom   -->9,10 -->  [1][2] [2][2]

            for (int j = rowBegin; j <= rowEnd; j++) {
                System.out.print(a[j][colEnd]);
                System.out.print(",");
            }

            colEnd--;
            if(rowBegin<=rowEnd) {
                //rightotleft -- > 5,3  --> [2][1]  [2][0]
                for (int k = colEnd; k >= colBegin; k--) {
                    System.out.print(a[rowEnd][k]);
                    System.out.print(",");
                }
            }
            rowEnd--;
        }
        //bottomtoTop -- > 5,3  --> [2][1]  [2][0]





    }
}
