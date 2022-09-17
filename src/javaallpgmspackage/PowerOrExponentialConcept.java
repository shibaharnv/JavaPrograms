package javaallpgmspackage;

public class PowerOrExponentialConcept {

    public static void main(String[] args)
    {
        int base=4;
        int exp =8;
        int ans =1;

        for(int i=1;i<=exp;i++) {
           // ans = ans * base;

            ans *=base;

            //both are equal ans*=base equal to ans = ans * base;

        }
        System.out.println("The answer is "+ans);

        System.out.println(Math.pow(2,2));

    }
}
