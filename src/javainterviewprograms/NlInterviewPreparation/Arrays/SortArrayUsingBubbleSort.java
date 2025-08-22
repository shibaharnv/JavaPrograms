    package javainterviewprograms.NlInterviewPreparation.Arrays;

    import java.util.Arrays;

    public class SortArrayUsingBubbleSort {

        public static void main(String[] args) {

            int[] a={9,7,1};
                    //0,1,2
            //{Compare two adjacent elements and switch the smallest item to left}

            int left=a[0];
            int right=a[1];
                int temp;
            for(int i=1;i<a.length;i++)
            {
                if(a[i-1]>a[i])
                {
                    temp=a[i-1];//22
                    a[i-1]=a[i];//10
                    a[i]=temp;//22

                }
            }

            System.out.println(Arrays.toString(a));


        }
    }
