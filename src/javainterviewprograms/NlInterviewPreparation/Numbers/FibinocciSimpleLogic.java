package javainterviewprograms.NlInterviewPreparation.Numbers;

public class FibinocciSimpleLogic {

    public static void main(String[] args) {


        int num =5;

        //{0,1,1,2,3
        // f,s,n
        // -,f,s,n}

        int first=0;
        int second=1;

        for(int i=1;i<=num;i++)
        {
            System.out.println(first+ "");
            int next =first+second;
            first=second;
              second= next;

        }
    }
}
