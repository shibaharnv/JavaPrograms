package javainterviewprograms.Strings;

public class StringBufferTest {

    public static void main(String[] args) {
        //String input = "2,2,3,1,0,4";
     //   String formattedOutput = formatString(input);
      //  System.out.println("Formatted Output: " + formattedOutput);

        StringBuilder sb= new StringBuilder("22314054");
        appendTest(sb);

        int[] a={1,2,3,4};
        StringBuilder sc= new StringBuilder("");
        for(int i=0;i<a.length;i++)
        {
            sc.append(a[i]);

            if(i!=a.length-1)
            {
                sc.append(",");
            }


        }

        System.out.println(sc);
    }

    //1st : -->1,
    //2nd : 1,2,
    //3rd:1,2,3,
    //4:1,2,3,4,
 //Convert: Array to String [1,2,3,4]="1,2,3,4"

    //take the first element append  it to resultstring
    //1,

    //input sb:2231
    //output:2,2,3,1

    //{Use StringBuilder append function
    // Iterate through the length of the string
     //0123
     //2231


  //sb.insert(1,",")  -->2,2,3,1

    //sb.insert(1,",")
    //sb.insert(3,",")
    //sb.insert(5,",")



    public static void appendTest(StringBuilder input)
    {
       for(int i=1;i< input.length();i=i+2)
       {
           input.insert(i,",");

       }

        System.out.println(input);
    }



    public static String formatString(String input) {
        String[] parts = input.split(",");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < parts.length; i++) {
            if (i > 0 && i % 2 == 0) {
                result.append(" "); // Add a space after every second number
            }
            result.append(parts[i]); // Append the current number or comma
            if (i < parts.length - 1) {
                result.append(","); // Append a comma after each number, except the last one
            }
        }

        return result.toString();
    }

    //[]
}


