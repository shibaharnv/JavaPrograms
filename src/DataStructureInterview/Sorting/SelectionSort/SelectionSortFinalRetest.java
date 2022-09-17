package DataStructureInterview.Sorting.SelectionSort;

import java.util.Arrays;

public class SelectionSortFinalRetest {

    public static void main(String[] args) {

        int[] a ={4,1,3,2};

        //{in selection sort finding the new minimum is the first target
        // keep traversing the entire array and find the new minimum
        // Finally swap the numbers ivalue and new minimum}

        int min=0;
        int jTemp=0;
        int iTemp=0;


                for(int i=0;i< a.length;i++)
                {
                    min=a[i];

                    for(int j=i+1;j< a.length;j++)
                    {
                        if(a[j]<min)
                        {

                            min=a[j];
                            a[j]=a[i];
                            a[i]=min;
                        }

                    }



            }

        System.out.println("Selection sort array "+Arrays.toString(a));
        }

    }

