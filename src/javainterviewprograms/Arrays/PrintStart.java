package javainterviewprograms.Arrays;

public class PrintStart {

    public static void main(String[] args) {


        for(int i=0;i<5;i++)
        {
            for(int j=1;j<=i+1;j++)
            {
                System.out.print("*");

            }
            System.out.println();
        }


        int rows = 4; // Number of rows in the pyramid

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Print spaces for alignment
            for (int j = 1; j <= (rows - i); j++) {
                System.out.print(" "); // Print space
            }

            // Print stars for the current row
            for (int k = 1; k <= i; k++) {
                System.out.print("* "); // Print star and space
            }

            // Move to the next line after each row
            System.out.println();

        }
    }
}
