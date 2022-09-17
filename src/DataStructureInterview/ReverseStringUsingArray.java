package DataStructureInterview;

public class ReverseStringUsingArray {

    public static void main(String[] args) {
        ReverseStringUsingArray obj = new ReverseStringUsingArray();

        //{reverse string
        // input="this is pen"
        // output=nep si siht
        // }

        String Test2 ="this is pen";

        char[] chararray={'a','b','c'};

        //chararra

        System.out.println(Test2.getClass().getName());
        String value =obj.reverseStringMethod(Test2);
        System.out.println(value);

    }

    String reverseStringMethod(String givenInput)
    {

        if(givenInput.length()<2 ||givenInput.getClass().getName()!="java.lang.String")
        {
          return "Not a valid input";
        }

        else {

            String reverse = "";
            for (int i = givenInput.length() - 1; i >= 0; i--) {
                char[] a = givenInput.toCharArray();

                reverse = reverse + givenInput.charAt(i);

                System.out.println("char array " + a[i]);
                System.out.println("reverse inside loop  " + reverse);
            }

            System.out.println("reverse outside loop  " + reverse);

            return reverse;
        }
    }

}
