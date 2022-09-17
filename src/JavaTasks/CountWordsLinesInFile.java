package JavaTasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountWordsLinesInFile {

    public static void main(String[] args) throws FileNotFoundException {
        //{1. Find the number of lines in the file
        // 2. Find the number of words in the file}

        File fobj = new File("/Users/snagarajan/Desktop/CTT/sample");
        Scanner sobj = new Scanner(fobj);
        int countLines=0;
        String lineByLineString;
        int totalWordCount=0;
        int temp=0;
        int finalWordCount=0;
        while (sobj.hasNextLine())
        {
            //System.out.println(sobj.nextLine());
            lineByLineString= sobj.nextLine();
            totalWordCount=countWords(lineByLineString);
            finalWordCount=totalWordCount+finalWordCount;
            totalWordCount=0;

//
            countLines++;
        }

        System.out.println("Number of Lines "+countLines);

        System.out.println("Number of words "+finalWordCount);




    }


    public static int countWords(String inputString)
    {
        int wordsCount=0;

       String[] stringArray= inputString.split("\\s+");

       for (int j=0;j< stringArray.length;j++)
       {
           System.out.println(stringArray[j]);
           wordsCount++;
       }

        System.out.println("wordsCount "+wordsCount);

        return wordsCount;
    }


}
