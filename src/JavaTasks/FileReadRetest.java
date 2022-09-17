package JavaTasks;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReadRetest {

    public static void main(String[] args) throws IOException {


        FileReader fr= new FileReader("/Users/snagarajan/Desktop/CTT/sample");


        Scanner sobj = new Scanner(fr);

        while (sobj.hasNext())
        {
            System.out.println(sobj.nextLine());
        }


    }
}
