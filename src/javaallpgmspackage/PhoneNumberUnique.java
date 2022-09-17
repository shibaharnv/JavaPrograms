package javaallpgmspackage;

import java.util.HashSet;

public class PhoneNumberUnique {

    public static void main(String[] args) {

        long phno=1234567890;

        String phString=String.valueOf(phno);

        System.out.println(phString.getClass());

        char[] chArray=phString.toCharArray();

        HashSet hs = new HashSet();
        boolean flag =true;
        for(char c :chArray)
        {
            if(!hs.add(c)) {
                flag = false;
            }
        }
        if(flag)
        {
            System.out.println("Given number is unique");
        }

        else
        {
            System.out.println("Given number is not unique");
        }
    }
}
