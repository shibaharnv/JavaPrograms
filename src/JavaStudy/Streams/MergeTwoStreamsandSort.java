package JavaStudy.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeTwoStreamsandSort {

    //take two integer streams merge and sort

    public static void main(String[] args) {


        int[] a={4,5,6,732,42,546,756,234,5461,2,43};
        int[] b={423,645,3,645,4,786,427,45,43};

        Integer[] integerArray1= new Integer[a.length];
        Integer[] integerArray2= new Integer[b.length];
        Arrays.setAll(integerArray1,i->a[i]);
        Arrays.setAll(integerArray2,i->b[i]);

        List<Integer> al1 = Arrays.asList(integerArray1);
        List<Integer> al2 = Arrays.asList(integerArray2);

        //Merging two streams

        Stream newStream=Stream.concat(al1.stream(),al2.stream());

        newStream.sorted().forEach(s-> System.out.println(s));



    }
}
