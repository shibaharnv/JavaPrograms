package JavaTasks;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class FileRead {

    public static void main(String[] args) throws IOException {

        //{Find no of words}

        FileReader frm= new FileReader("/Users/snagarajan/Desktop/CTT/sample");
        int myData = frm.read();

        int wordCount=1;

        while (myData!=-1)
        {
            char mychar =(char) myData;
            //check if that is a space
            if(mychar==' ')
            {
                wordCount++;
            }
            System.out.print(mychar);
            myData = frm.read();
        }

        System.out.println("wordCount"+wordCount);

        //{Method 1: File reader Class}

        FileReader frobj = new FileReader("/Users/snagarajan/Desktop/CTT/sample");

            int data=frobj.read();

            int noOfCharacters=0;

            while (data!=-1)
            {
                System.out.print((char)(data));
                data=frobj.read();
                noOfCharacters++;

            }

        System.out.println("noOfCharacters"+noOfCharacters);



        // {Method 2: File and scanner class}

        File fobj =new File("/Users/snagarajan/Desktop/CTT/sample");
        Scanner sobj = new Scanner(fobj);

        int noOfLines=0;

        while (sobj.hasNextLine())
        {
            System.out.println(sobj.nextLine());
            noOfLines++;
        }

        System.out.println("noOfLines"+noOfLines);
    }

    //{Find number of words if there is space between two character then we can considert that as word
    // }
}
