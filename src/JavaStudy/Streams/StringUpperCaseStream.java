package JavaStudy.Streams;

import java.util.ArrayList;

public class StringUpperCaseStream {

    public static void main(String[] args)
    {
        //Given a list of strings, convert each string to uppercase using streams.

        ArrayList<String> al= new ArrayList<>();
        al.add("abc");
        al.add("def");
        al.add("Ayz");


        al.stream().map(i->i.toUpperCase()).forEach(k-> System.out.println(k));

        //al.stream().filter(i-> Boolean.parseBoolean(i.toLowerCase())).map(k->k.toUpperCase()).forEach(s-> System.out.println(s));

    }
}
