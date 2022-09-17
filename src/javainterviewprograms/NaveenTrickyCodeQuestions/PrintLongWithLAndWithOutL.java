package javainterviewprograms.NaveenTrickyCodeQuestions;

public class PrintLongWithLAndWithOutL {


    public static void main(String[] args)
    {
        long withoutl=1000*60*60*24*365;

        long withl=1000*60*60*24*365L;

        System.out.println(withoutl);//1471228928

        System.out.println(withl);// 31536000000- Correct output

        //Integer 32 bits--without l--->total multiplication value is 36 bits so it removes the first four bits and convert
        //the remaining 32 bits so the value is 1471228928
        //long 64 bits - since the limit is 64 bits the we will get the actual value
    }
}
