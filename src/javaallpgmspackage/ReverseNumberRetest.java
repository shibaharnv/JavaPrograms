package javaallpgmspackage;

public class ReverseNumberRetest {


    public static void main(String[] args) {

        int a=123;
        int remain=0;
        int quotient=0;
        String result="";
       while (a>0)
        {

           remain =a%10;

           result=result+remain;
           quotient=a/10;

            a=quotient;
        }

        System.out.println(result);

       //{1st itr :
        // remain=3
        // result=3
        // quo=12}

        //{2nd itr
        // remain=2
        // result=32
        // quo=1}

        //{3rd itr
        // //remain=1
        // result=321
        // }
    }
}
