package javainterviewprograms.NlInterviewPreparation.Numbers;

public class LeapYearOrNot {

    public static void main(String[] args) {

        //{Input year 4 digit -Output is booleean
        // when we divide by 4 remainder should be zero}
        int year=1000;

        if(year%4==0 && year%100!=0 || year%400==0)
        {
            System.out.println(+year+ " is leap year");
        }

        else {
            System.out.println(+year+ " is Not leap year");
        }

    }
}
