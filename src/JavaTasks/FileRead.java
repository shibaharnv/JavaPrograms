package JavaTasks;

import javax.swing.*;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.*;
import java.util.Scanner;

public class FileRead {

    public static void main(String[] args) throws IOException {

        //{Find no of words}
          File fs= new File("/Users/shibahar/Desktop/Shibahar/Resume/test.txt");
        FileReader frm= new FileReader(fs);


        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(frm);
        String line;
        int count=0;
        while (br.readLine()!=null)
        {

            System.out.println(count++);
            System.out.println();
        }

        System.out.println(count);

//       int count= Integer.parseInt(br.readLine());
//        System.out.println(count);


        Scanner scan= new Scanner(System.in);






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

        FileReader frobj = new FileReader("/Users/shibahar/Desktop/Shibahar/Resume/test.txt");

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

        File fobj =new File("/Users/shibahar/Desktop/Shibahar/Resume/test.txt");
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
