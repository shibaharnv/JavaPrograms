package DataStructureInterview;

import java.util.HashMap;
import java.util.Map;

public class ArrayCommonItemsUsingMap {

    public static void main(String[] args) {

        ArrayCommonItemsUsingMap obj = new ArrayCommonItemsUsingMap();

        Map mapobj = new HashMap();

        char[] chararray1 = {'a', 'b', 'c'};

        char[] chararray2 = {'d', 'e', 'c'};

         boolean result=  obj.arrayCompareFunction(chararray1, chararray2);

        System.out.println("result " +result);

        if(result)
        {
            System.out.println("Arrays have items in common");
        }
        else
        {
            System.out.println("Arrays dont have any items in common");
        }
    }

boolean arrayCompareFunction(char[] input1, char[] input2)
{

    Map mapobj = new HashMap();

    for (int i=0;i<input1.length;i++)
    {
        if(mapobj.get(i)==null)
        {
            char item =input1[i];
            mapobj.put(item,true);
        }
    }

    for(int j=0;j<input2.length;j++)
    {
        System.out.println("input2 of  "+input2[j]);
        if(mapobj.get(input2[j])!=null)
        {
            return true;
        }

    }

    return false;
}

}
