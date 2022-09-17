package javaallpgmspackage;

public class ArmStrongNumberCheckBetweenIntervals {

    public static void main(String[] args)
    {
        int num =153;
        int remainder=0;
        //double sum=0;
        int exp=3;
        int low=101;
        int high=2000;

        while(low<=high) {
            double sum=0;
           int givennum= low;
            while (low != 0) {
                remainder = low % 10;
                low = low / 10;
                sum = sum + Math.pow(remainder, exp);
            }
            if(givennum==sum)
            {
                System.out.println(givennum +" ");
            }

            low =givennum;
            low++;
        }
    }
}
