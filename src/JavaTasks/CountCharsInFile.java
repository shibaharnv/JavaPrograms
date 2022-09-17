package JavaTasks;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountCharsInFile {

    public static void main(String[] args) throws IOException {
        //{For characters reading always use FileReader
        // }

        FileReader fobj = new FileReader("/Users/snagarajan/Desktop/CTT/sample");

        int data=fobj.read();
        int charCount=0;

        while (data!=-1)
        {
            System.out.print((char)(data));
            data=fobj.read();
            charCount++;
        }

        System.out.println("charCount "+charCount);
    }
}
