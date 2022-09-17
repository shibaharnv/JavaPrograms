package DataStructureInterview;

public class BigONotationWorstCaseRemoveConstants {

    public static void main(String[] args)
    {

        String[] arr = {"abc","fsdf","rewwer","rweree","rwerweweqweqwe","abc"};

        BigONotationWorstCaseRemoveConstants obj = new BigONotationWorstCaseRemoveConstants();

        obj.findAbcFunction(arr);


    }


    void findAbcFunction(String[] myarr)
    {
        for(int i=0;i<myarr.length;i++)
        {
            System.out.println("Inside loop");
            if(myarr[i]=="abc")
            {
                System.out.println("found abc");
                break;
            }
        }
    }
}
