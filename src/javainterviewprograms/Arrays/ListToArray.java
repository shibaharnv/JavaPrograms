package javainterviewprograms.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);


        list.toArray(new Integer[0]);

        Integer[] array = list.toArray(new Integer[list.size()]);

        System.out.println(Arrays.toString(array));


    }
}
