package JavaStudy.Streams;

import java.util.Arrays;
import java.util.List;

public class CheckElementInStreams {

    public static void main(String[] args) {

        String[] a= {"abc","xyz","adf","kkx"};

        List<String> al = Arrays.asList(a);

        boolean result=al.stream().anyMatch(s->s.equalsIgnoreCase("abc"));


       // result=false;
        assert result: "x is not greater than y";;

        boolean condition = false; // Replace with your boolean condition

// Using assert to check the condition
        assert condition : "The condition is false!"; // An optional message can be provided

// The program continues if the condition is true
        System.out.println("Program continues because the condition is true.");

       // System.out.println(result);


    }
}
