package javainterviewprograms;

public class Sabaraish {

    public static void main(String[] args)
    {

        int a =3;
        int n=4;
        int[] array={103,13,135,163,333};
        int ans =indexSum(a,n,array);

        System.out.println(ans);
    }


    public static int indexSum(int A, int N, int[] Array)
    {

        int arrayvalue=0;

        int indexvalue=0;

        String SA=String.valueOf(A);

        for(int i =0; i<Array.length;i++)
        {
            arrayvalue=Array[i];

            String s=String.valueOf(arrayvalue);

            if(s.contains(SA))
            {
                indexvalue=i+indexvalue;
            }
        }

        return indexvalue;

    }
}
