package DataStructureInterview;

import java.util.ArrayList;
import java.util.Arrays;

public class DataStructureLearning {

    public static void main(String[] args)
    {
       // long startTime = System.nanoTime();
        long startTime = System.currentTimeMillis();

        String[] names = new String[10000000];

        Arrays.fill(names,"nemo");

        ArrayList<String> aobj = new ArrayList<String>();

        //aobj={"nemo"};
        DataStructureLearning dobj = new DataStructureLearning();

       // String[] names = {"nemo","Test","run","take","take2","take3","take4"};

/*        String[] names = {"nemos","nemos","nemos","nemos","nemos","nemos"};

    Arrays.fill(names,"nemo");*/

        dobj.foundNemo(names);

        //long stopTime = System.nanoTime();
        long stopTime = System.currentTimeMillis();

        System.out.println("arraylength "+names.length);

        long totaltimetaken = stopTime - startTime;
        System.out.println("totaltimetaken" +totaltimetaken);
    }


    void foundNemo(String[] namesinput)
    {
        for(int i=0;i<namesinput.length;i++)
        {
            if(namesinput[i]=="nemo")
            {

                System.out.println("Found Nemo");
            }
        }

    }
}
