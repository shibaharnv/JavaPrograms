package javainterviewprograms;

public class PrintFibinnociNumbers {

    public static void main(String[] args) {

        //0, 1, 1, 2, 3, 5, 8, 13,

        int firstNum=0;
        int secondNum=1;

        //3rd =first +second
        //4th= 3rd+2nd
        //5th= =4th +3rd
        //6th = 5th +4th
        //7th = 6th +5th

        int position=3;

        int value=0;
        int temp=0;
       for(int i=3;i<20;i++)
       {
           value=firstNum+secondNum;
           System.out.print(value);
           System.out.print(",");
           temp=secondNum;
           secondNum=value;
           firstNum=temp;


       }


        //{0,1,1,2,3,5,8
        // n=n-1 + n-2
        // n=(n-1)+(n-2
        //
        // if n==0 print 0
        // if n=1 print 1
//        // if n=2 print (2-1) +(2-2)-->(n-1)+(n-2)}
//        int zeroNumber=0;
//        int firstNumber=1;
//        //int n=1;
//        int number=0;

//        for(int n=0;n<10;n++)
//        {
//            if(n==0)
//            {
//                System.out.print(zeroNumber);
//                System.out.print(",");
//            }
//
//            else if(n==1)
//            {
//                System.out.print(firstNumber);
//                System.out.print(",");
//            }
//
//            else
//
//            {
//
//                number=(n-1)+(n-2);
//                System.out.print(number);
//                System.out.print(",");
//            }
//        }
    }
}
