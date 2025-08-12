package javainterviewprograms.NlInterviewPreparation.Strings;

public class StringTransformation {


    //{input="tomorrow",
    // ouput=t3m3223w
    // o replaced by 3
    // r replaced by 2}
    public static void main(String[] args) {

        String input="tomorrow";

        input=input.replace("[o]","3");

        input=input.replace("[r]","2");

        System.out.println(input);
    }
}
