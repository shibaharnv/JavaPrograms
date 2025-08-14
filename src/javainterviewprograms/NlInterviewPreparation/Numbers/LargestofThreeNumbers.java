package javainterviewprograms.NlInterviewPreparation.Numbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestofThreeNumbers {

    public static void main(String[] args) {


        int n1=10;
        int n2=5;
        int n3=3;

        if(n1>n2)
        {
            if(n1>n3)
            {
                System.out.println(+n1+ " n1 is greater");
            }

        }
        else if(n2>n3)
        {
            System.out.println(+n2+ " n2 is greater" );
        }
        else {
            System.out.println(+n3+ " n3 is greater");
        }


        List<Integer> list = new ArrayList<>();

        list.add(n1);
        list.add(n2);
        list.add(n3);
        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        System.out.println(list.getLast());





    }
}
