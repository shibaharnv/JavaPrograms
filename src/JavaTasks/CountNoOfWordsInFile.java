package JavaTasks;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CountNoOfWordsInFile {

    public static void main(String[] args) throws IOException {

        File fobj = new File("/Users/snagarajan/Desktop/CTT/sample");

        Scanner sobj = new Scanner(fobj);


        String stringArray= sobj.nextLine();

        String[] myStringArray=  stringArray.split("\\s+");
        int count=0;
        for (int i=0;i<myStringArray.length;i++)
        {
            System.out.println(myStringArray[i]);
            count++;
        }

        System.out.println("No of words "+count);

//        while (sobj.hasNextLine())
//        {
//            System.out.println(sobj.nextLine());
//
//
//        }

    }
}
