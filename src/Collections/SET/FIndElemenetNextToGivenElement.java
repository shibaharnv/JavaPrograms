package Collections.SET;

import java.util.*;

public class FIndElemenetNextToGivenElement {

    public static void main(String[] args) {
        //{Input set with {5,3,7,4,8}
        //{find the number next to 7}

        int[] a={5,3,7,4,8};

        Integer[] integerArray = new Integer[a.length];

        Arrays.setAll(integerArray,i->a[i]);

        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(integerArray));
        Set<Integer> set1 = new HashSet<>(Arrays.asList(integerArray));

        System.out.println(set);

        List<Integer> list= new ArrayList<>(set);

        System.out.println(list);

        int requriedIndex=0;

        for(Integer e:list)
        {
           // int index=list.indexOf(e);

            if(e==7)
            {
                int index=list.indexOf(e);
                requriedIndex=index+1;
                break;
            }

        }

        System.out.println(list.get(requriedIndex));


    }
}
