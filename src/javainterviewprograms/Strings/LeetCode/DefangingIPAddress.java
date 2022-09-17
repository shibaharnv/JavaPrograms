package javainterviewprograms.Strings.LeetCode;

public class DefangingIPAddress {

    public static void main(String[] args)
    {
        //{Input: address = "1.1.1.1"
        //Output: "1[.]1[.]1[.]1"}
        String address = "1.1.1.1";
        String answer=defangIPaddr(address);
        System.out.println(answer);
    }

    public static String defangIPaddr(String address)
    {

        String newAddress;

        newAddress=address.replaceAll("[.]","[.]");

        return newAddress;

    }
}
