package JavaStudy.Streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamsPractice {

    public static void main(String[] args) {

        //Given a list of integers, filter out the even numbers and print them.

        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(3);
        al.add(4);
        al.add(6);
        al.add(5);
        al.add(9);

        //filter even numbers using stream and print
        //condition%2==0




        al.stream().filter(i->(i%2!=0)).forEach(k-> System.out.println(k));

        Stream.of(23,45,67,89,44,66,99).filter(i->(i%2==0)).forEach(k-> System.out.println(k));
    }
}





// al.stream().filter(k->(k%2)==0).forEach(s-> System.out.println(s));
