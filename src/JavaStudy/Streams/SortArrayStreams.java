package JavaStudy.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArrayStreams {
    public static void main(String[] args) {

        String[] a= {"abc","xyz","adf","kkx"};

        List al = Arrays.asList(a);

        al.stream().sorted().forEach(i-> System.out.println(i));
    }
}
