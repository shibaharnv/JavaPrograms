package javainterviewprograms.NlInterviewPreparation.Arrays;

public class TwoDimensionSumOfAllElements {

    public static void main(String[] args) {
        int[][] a= new int[2][2];

        a[0][0]=5;
        a[0][1]=10;
        a[1][0]=15;
        a[1][1]=20;

        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                sum+=a[i][j];
            }
        }

        System.out.println(sum);
    }
}
