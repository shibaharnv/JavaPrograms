package DataStructureInterview;

import java.util.Arrays;

public class BigONotation {

//big O Notation and time measurement calculation


    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        String[] names = new String[1000];

        Arrays.fill(names,"nemo");

        DataStructureLearning dobj = new DataStructureLearning();

        dobj.foundNemo(names);

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
