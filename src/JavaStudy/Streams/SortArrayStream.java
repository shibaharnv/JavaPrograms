package JavaStudy.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortArrayStream {

    public static void main(String[] args) {


        List<Integer> al=Arrays.asList(1,2,3,4,5,6,6,7,234,76,243,867,243);


        //Sort the array
        List<Integer> al2=al.stream().sorted().collect(Collectors.toList());
        System.out.println(al2);

        //print unique numbers
        List<Integer> alnew=al2.stream().distinct().collect(Collectors.toList());
        System.out.println("unique array "+alnew);
    }
}
