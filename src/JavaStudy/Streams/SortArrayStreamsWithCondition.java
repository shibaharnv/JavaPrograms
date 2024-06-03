package JavaStudy.Streams;

import java.util.Arrays;
import java.util.List;

public class SortArrayStreamsWithCondition {
    public static void main(String[] args) {

        String[] a= {"abc","xyz","adf","kkx"};

        List<String> al = Arrays.asList(a);

     al.stream().filter(i->i.startsWith("a")).limit(3).forEach(i-> System.out.println(i));
    }
}
