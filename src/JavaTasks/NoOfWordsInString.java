package JavaTasks;

import java.util.Arrays;

public class NoOfWordsInString {

    public static void main(String[] args)
    {
        String abc = "This is a text message";

        String[] data = abc.split("\\s+");

        System.out.println(data[3]);
        System.out.println("data "+ Arrays.toString(data));
        int count=0;
        for (int i=0;i<data.length;i++)
        {
            count++;
        }
        System.out.println("count"+count);

    }


}
