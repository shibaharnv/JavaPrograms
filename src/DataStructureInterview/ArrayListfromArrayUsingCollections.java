package DataStructureInterview;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayListfromArrayUsingCollections {

    // Convert array to arraylist

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        String[] stringarr = {"re","rere", "fdsfsd"};


        List<Integer> myarraylist = IntStream.of(arr).boxed().collect(Collectors.toList());

        myarraylist.remove(2);

        System.out.println(myarraylist.toString());

        System.out.println(myarraylist.size());

    }


}
