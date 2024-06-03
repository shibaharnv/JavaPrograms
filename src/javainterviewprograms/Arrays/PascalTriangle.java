package javainterviewprograms.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {



        List al1 = new ArrayList<>();
        List al2 = new ArrayList<>();
        List al4 = new ArrayList<>();
        List<List> al3 = new ArrayList<>();
        al1.add(1);
        al2.add(1);
        al2.add(2);
        al4.add(1);
        al4.add(2);
        al4.add(3);

        al3.add(al1);

        al3.add(al2);
        al3.add(al4);

        System.out.println(al3);

        for(List e:al3)
        {
            System.out.println(e);
        }





    }
}
