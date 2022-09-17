package javainterviewprograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToTextFile {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("/Users/snagarajan/Desktop/CIA/testing.txt");

        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("THIS IS TESTING");

        bw.close();
    }
}
