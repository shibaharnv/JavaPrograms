package javainterviewprograms.NlInterviewPreparation.Strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringConversion {

    public static void main(String[] args) {

        //{String data = "Kalyani Lives in Pune";
        //Output: K L in Pune
        // Input and output are string
        // spilt with space and put in string array
        // iterate with for each
        // for first two index retain only first letter and rest keep it}

        String input="Kalyani Lives in Pune";

        String[] stringArray=input.split(" ");

        StringBuffer sb = new StringBuffer();

        System.out.println(Arrays.toString(stringArray));

        for(int i=0;i<stringArray.length;i++)
        {

            if(i==0 ||i==1)
            {
                stringArray[i]=stringArray[i].substring(0,1);
            }
        sb.append(stringArray[i]);
        sb.append(" ");
        }

        System.out.println(sb);
    }
}
