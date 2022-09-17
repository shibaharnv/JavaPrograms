package javainterviewprograms.NaveenTrickyCodeQuestions;

import java.util.BitSet;

public class Print1to100WithoutLoopAndRecursion {

    //{In order to print 1 to 100 without loop and recursion we need to use Arrays fill or bitset from Java util}

    public static void main(String[] args)
    {
        String set = new BitSet() {{set(1,100);}}.toString();

        System.out.append(set,1,set.length());

//
//                   String bs= new BitSet() {{set(1,100);}}.toString();
//
//        System.out.append(bs,1,bs.length());
    }
}
