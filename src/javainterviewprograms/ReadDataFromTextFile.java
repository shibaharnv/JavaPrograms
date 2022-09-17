package javainterviewprograms;

import java.io.*;
import java.util.Scanner;

public class ReadDataFromTextFile {


    public static void main(String[] args) throws IOException {

        //Approach 1: Using file reader and bufferreader class

        FileReader fr = new FileReader("/Users/snagarajan/Desktop/CIA/testing.txt");

        BufferedReader br = new BufferedReader(fr);
        String str;
        while ((str=br.readLine())!=null)
        {
            System.out.println(str);
        }

        // Approach 2 using file and scanner class

        File fobj = new File("/Users/snagarajan/Desktop/CIA/testing.txt");
        Scanner sc = new Scanner(fobj);

        while (sc.hasNextLine())
        {
            System.out.println(sc.nextLine());
        }

        //Approach :3
        sc.useDelimiter("\\Z");
        System.out.println(sc.nextLine());

    }
}
