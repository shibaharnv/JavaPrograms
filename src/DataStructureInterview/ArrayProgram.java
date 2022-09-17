package DataStructureInterview;

public class ArrayProgram {


    public static void main(String[] args) {

        char[] num ={'a','b','c','d','e'};

        ArrayProgram obj = new ArrayProgram();

        obj.printPairs(num);
    }



    void printPairs(char[] mynum)
    {

        int count =0;
        for(int i=0;i<mynum.length;i++)
        {
            for(int j=0;j<mynum.length;j++)
            {
                count++;
                System.out.println(mynum[i] +"" +mynum[j]);
               // System.out.println(arr[i] + ""+ arr[j] +""+ arr[k]);
            }
        }

        System.out.println("total count "+count);
    }
}
