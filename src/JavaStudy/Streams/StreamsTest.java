package JavaStudy.Streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamsTest {

    public static void main(String[] args) {


        //This program is to find the count of  words that start with a
        ArrayList<String> al = new ArrayList<>();
        al.add("abhith");
        al.add("akshay");
        al.add("testing");


        //here stream is the collection of string
        long ans = al.stream().filter(s -> s.startsWith("a")).count();
        System.out.println(ans);

        //We can create stream,
        //Stream- Intermediate operator- Terminal(last) operator
        //Terminal operator will be executed only if intermediate operator returns true
        //There is no life for intermediate op if there is no terminal output

        long result = Stream.of("abhi", "arun", "aumar").filter(s -> s.startsWith("a")).count();
        System.out.println(result);

        long ccc=Stream.of("naga","act").filter(s->s.startsWith("n")).count();
        System.out.println("cc "+ccc);


        long ddd=Stream.of("naga","act").filter(s->{s.startsWith("n"); return false; }).count();
        System.out.println("ddd "+ddd);


    }
}
