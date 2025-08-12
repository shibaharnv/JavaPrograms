package javainterviewprograms.NlInterviewPreparation.Numbers;

public class ReverseInteger {

    public static void main(String[] args) {

        int num= 12;
        int remainder=0;
        String result="";
        int reveresed=0;
        while (num!=0)

        {
            remainder=num%10;
        reveresed=reveresed*10 +remainder;
        num=num/10;
        result=result+remainder;
        }

        System.out.println(result);
        System.out.println(reveresed);
    }
}
