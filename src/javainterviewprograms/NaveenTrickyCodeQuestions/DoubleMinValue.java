package javainterviewprograms.NaveenTrickyCodeQuestions;

public class DoubleMinValue {

    public static void main(String[] args) {
        //Double and float minimum value is positive number
        System.out.println(Double.MIN_VALUE);
        System.out.println(Float.MIN_VALUE);

        //Long and integer minimum values are negative number
        System.out.println(Long.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Math.min(4,5));

        System.out.println(Math.min(Double.MIN_VALUE,0.0));
        System.out.println(Math.min(Float.MIN_VALUE,0.0));

        System.out.println(Math.min(Long.MIN_VALUE,0.0));
        System.out.println(Math.min(Integer.MIN_VALUE,0.0));

        System.out.println(Math.min(Double.MIN_VALUE,Double.NEGATIVE_INFINITY));
    }
}
