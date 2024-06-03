package JavaStudy.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectMethod {

    //{Have a list using streams create a another list condition is create list only with strings starting with a}

    public static void main(String[] args) {


        ArrayList<String> al= new ArrayList<>();
        al.add("abc");
        al.add("def");
        al.add("ayz");

        List<String> newAl=al.stream().filter(i->i.startsWith("a")).collect(Collectors.toList());

        System.out.println(newAl);




    }
}
