package javainterviewprograms.Arrays;

import java.util.ArrayList;

public class ArrayMissingNumbers {



        public static void main(String[] args) {

            int[] a={4,5,7,9};
           findMissingNumbers(a);

           //{find the difference between two adjacent indexs and if it is greater than 1 assiguming sorted and no duplicates}
        }


        public static ArrayList findMissingNumbers(int[] inputArray)
        {
            ArrayList al = new ArrayList();

            for(int i=0;i<inputArray.length-1;i++)
            {
                if(inputArray[i+1]-inputArray[i]!=1)
                {
                    al.add(inputArray[i]+1);
                }
            }


            System.out.println(al);
            return al;
        }

    }

